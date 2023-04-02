package th.co.cbank.project.view;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import th.co.cbank.project.control.CbSaveAccountControl;
import th.co.cbank.project.control.CbSaveConfigControl;
import th.co.cbank.project.control.CbTransactionLoanControl;
import th.co.cbank.project.control.CbTransactionSaveControl;
import th.co.cbank.project.control.Value;
import th.co.cbank.project.model.CbSaveConfigBean;
import th.co.cbank.project.model.CbTransactionSaveBean;
import th.co.cbank.util.DateFormat;

public class TransactionAdvanceMethod {

    private static final CbSaveConfigControl saveConfigControl = new CbSaveConfigControl();
    private static final CbTransactionLoanControl cbTransactionLoanControl = new CbTransactionLoanControl();
    private static final CbTransactionSaveControl cbTransactionSaveControl = new CbTransactionSaveControl();

    public static double balanceAmount = 0;
    public static double interestAmount = 0;

    public static void updateSaveAccountAndProfile(String custCode, String accCode, double netBalance, double textInt) {
        //update cb_save_account
        CbSaveAccountControl saveAccountControl = new CbSaveAccountControl();
        saveAccountControl.updateSaveAccountAndProfile(netBalance, textInt, custCode, accCode);

        //update cb_profile
        saveAccountControl.updateSaveAccountAndProfile(accCode, custCode);
    }

    public static List findData(String custCode, String accCode, boolean addModel) {
        double show1 = 0.00;//ฝาก
        double show2 = 0.00;//ถอน
        double show3 = 0.00;//คงเหลือ
        double show4 = 0.00;//กำไรทบต้น
        double show5 = 0.00;//ยอดเงินสุทธิ

        balanceAmount = 0;
        interestAmount = 0;

        List modelList = new ArrayList<>();
        String date = "";
        CbTransactionSaveControl tranSaveControl = new CbTransactionSaveControl();
        List<CbTransactionSaveBean> listTransactionSaveReport = tranSaveControl.getTdateList(custCode, accCode);
        for (CbTransactionSaveBean bean : listTransactionSaveReport) {
            date += DateFormat.getLocale_ddMMyyyy(bean.getT_date()) + ",";
        }
        date += DateFormat.getLocale_ddMMyyyy(new Date());

        //add to model
        String[] dates = date.split(",");
        Date dateStart = DateFormat.getLocal_ddMMyyyy(dates[0]);
        Date dateEnd = DateFormat.getLocal_ddMMyyyy(dates[dates.length - 1]);

        Calendar c = Calendar.getInstance();
        c.setTime(dateStart);

        boolean isLoop = false;
        CbSaveConfigBean cfBean = saveConfigControl.listSaveConfig(accCode);
        int dayCount = 0;
        String temp_date = "";

        double all_balance = 0.00;//เก็บยอดเงิน balance
        double all_interest = 0.00;//เก็บยอดยกมาของดอกเบี้ย
        double all_money = 0.00;//เงินต้น
        int LineNo = 0;

        while (!isLoop) {
            String dateStr = DateFormat.getLocale_ddMMyyyy(c.getTime());
            if (temp_date.equals("")) {
                temp_date = dateStr;
            }
            if (!temp_date.equals(dateStr)) {
                dayCount++;
            }

            ItemRows data = new ItemRows();
            data.setT_date(c.getTime());
            data.setT_time("");
            data.setT_docno("");
            data.setRemark("");
            data.setInterest_rate(cfBean.getTypeINT());
            data.setT_day(dayCount);
            data.setBalance(all_balance);
            data.setT_interest((data.getT_day() * data.getInterest_rate() * all_balance) / (36500));
            data.setT_interest_balance(all_interest);
            data.setPrinciple(all_money);

            boolean isDateIn = false;
            for (int i = 0; i < dates.length; i++) {
                if (dates[i].equals(DateFormat.getLocale_ddMMyyyy(c.getTime()))) {
                    List<CbTransactionSaveBean> listBean = cbTransactionSaveControl.getTransaction(custCode, accCode, c.getTime());
                    double temp_all_interest = all_interest;

                    for (int j = 0; j < listBean.size(); j++) {
                        CbTransactionSaveBean bean1 = (CbTransactionSaveBean) listBean.get(j);

                        ItemRows data2 = new ItemRows();
                        data2.setT_date(bean1.getT_date());
                        data2.setT_time(bean1.getT_time());
                        data2.setT_docno(bean1.getT_docno());
                        all_balance += bean1.getT_amount();
                        if (all_balance < 1) {
                            all_balance = 0;
                        }

                        //เก็บเฉพาะเงินต้น
                        all_money += bean1.getT_amount();
                        data2.setPrinciple(all_money);
                        data2.setBalance(all_balance);
                        data2.setT_interest((data2.getT_day() * data2.getInterest_rate() * all_balance) / (36500));
                        data2.setT_day(0);

                        all_interest = data.getT_interest() + temp_all_interest;
                        //temp_all_interest = 0;

                        if (bean1.getT_amount() >= 0) {
                            data2.setDeposit(bean1.getT_amount());
                            data2.setRemark("<html><font color=blue><b>ฝากเงิน</b></font></html>");
                            show1 += bean1.getT_amount();
                            data2.setT_interest_balance(all_interest);
                        } else {
                            data2.setWithdraw(bean1.getT_amount());
                            data2.setRemark("<html><font color=red><b>ถอนเงิน</b></font></html>");
                            show2 += bean1.getT_amount() * -1;
                            data2.setT_interest_balance(all_interest);
                        }

                        data2.setInterest_rate(cfBean.getTypeINT());
                        data2.setIsPrint("Y");
                        LineNo++;

                        data2.setLineNo("" + LineNo);
                        data2.setProfit(data2.getBalance() - data2.getPrinciple());
                        if (addModel) {
                            modelList.add(data2.toObject());
                        }

                        //update recode
                        cbTransactionSaveControl.updateWhereCustCodeAccode(data2.getBalance(), custCode, accCode, data2.getT_docno(), data2.getT_time());
                    }

                    isDateIn = true;
                    dayCount = 0;
                    break;
                }
            }

            boolean isUpdate = false;
            //check เงื่อนไขการจ่ายดอกเบี้ยเพิ่ม
            if (cfBean.getPayType().equals("2")) {
                int dd_db1 = cfBean.getCbPayType1();
                int mm_db1 = cfBean.getCbPayType2();
                Calendar c1 = Calendar.getInstance(Locale.ENGLISH);
                c1.setTime(c.getTime());//เอาปีของความเคลื่อนไหวก่อนหน้า เพื่อเลือกวันที่คำนวณ
                c1.set(Calendar.DATE, dd_db1);
                c1.set(Calendar.MONTH, mm_db1 - 1);
                if (c1.getTime().compareTo(c.getTime()) == 0) {
                    data.setT_time("00:00:00");
                    data.setRemark("<html><font color=green><b>ดอกเบี้ยทบเงินต้น</b></font></html>");
                    data.setIsPrint("Y");
                    LineNo++;
                    data.setLineNo("" + LineNo);

                    data.setBalance(all_balance + data.getT_interest() + data.getT_interest_balance());
                    data.setDeposit_interest(data.getT_interest() + data.getT_interest_balance());
                    show4 += data.getDeposit_interest();
                    data.setT_interest_balance(0);
                    all_interest = 0;//clear ดอกเบี้ยทบต้นออก
                    data.setT_interest(0);
                    dayCount = 0;
                    all_balance = data.getBalance();
                    isUpdate = true;

                    //insert ดอกเบี้ยฝาก
                    int lineNo = cbTransactionLoanControl.getLineByAccount(accCode);
                    int tIndex = lineNo;
                    if (tIndex > 24) {
                        tIndex = tIndex % 24;
                    }
                    CbTransactionSaveBean bean = new CbTransactionSaveBean();
                    bean.setT_date(data.getT_date());
                    bean.setT_time(data.getT_time());
                    bean.setT_acccode(accCode);
                    bean.setT_custcode(custCode);
                    bean.setT_description("ฝากเงิน(ดอกเบี้ย)");
                    bean.setT_amount(data.getDeposit_interest());
                    bean.setT_empcode("system");
                    bean.setT_docno("");
                    bean.setT_booktype("INT");
                    bean.setLineNo(lineNo);
                    bean.setPrintChk("N");
                    bean.setT_balance(data.getBalance());
                    bean.setT_index(tIndex);
                    bean.setMoney_in(data.getDeposit_interest());
                    bean.setMoney_out(0);
                    bean.setBranchCode(Value.BRANCH_CODE);
                    bean.setT_interest(0);
                    bean.setT_fee(0);
                    bean.setT_status("11");

                    if (bean.getT_amount() > 0) {
                        cbTransactionSaveControl.saveCbTransactionSave(bean);
                    }
                }
            } else if (cfBean.getPayType().equals("3")) {
                //ช่วงที่ 1
                int dd_db1 = cfBean.getCbPayType3();
                int mm_db1 = cfBean.getCbPayType4();
                Calendar c1 = Calendar.getInstance(Locale.ENGLISH);
                c1.setTime(c.getTime());//เอาปีของความเคลื่อนไหวก่อนหน้า เพื่อเลือกวันที่คำนวณ
                c1.set(Calendar.DATE, dd_db1);
                c1.set(Calendar.MONTH, mm_db1 - 1);
                //จบช่วงที่ 1

                //ช่วงที่ 2
                int dd_db2 = cfBean.getCbPayType5();
                int mm_db2 = cfBean.getCbPayType6();
                Calendar c2 = Calendar.getInstance(Locale.ENGLISH);
                c2.setTime(c.getTime());//เอาปีของความเคลื่อนไหวก่อนหน้า เพื่อเลือกวันที่คำนวณ
                c2.set(Calendar.DATE, dd_db2);
                c2.set(Calendar.MONTH, mm_db2 - 1);
                //จบช่วงที่ 2

                if (c1.getTime().compareTo(c.getTime()) == 0 || c2.getTime().compareTo(c.getTime()) == 0) {
                    data.setT_time("00:00:00");
                    data.setRemark("<html><font color=green><b>ดอกเบี้ยทบเงินต้น</b></font></html>");
                    data.setIsPrint("Y");
                    LineNo++;
                    data.setLineNo("" + LineNo);
                    if (all_balance < 1) {
                        data.setBalance(0);
                        data.setT_interest(0);
                        data.setT_interest_balance(0);
                    } else {
                        data.setBalance(all_balance + data.getT_interest() + data.getT_interest_balance());
                    }
                    data.setDeposit_interest(data.getT_interest() + data.getT_interest_balance());
                    show4 += data.getDeposit_interest();
                    data.setT_interest_balance(0);
                    all_interest = 0;//clear ดอกเบี้ยทบต้นออก
                    data.setT_interest(0);
                    dayCount = 0;
                    all_balance = data.getBalance();
                    isUpdate = true;

                    //insert ดอกเบี้ยฝาก
//                    int lineNo = cbTransactionSaveControl.getLineByAccount(accCode);
//                    int tIndex = lineNo;
//                    if (tIndex > 24) {
//                        tIndex = tIndex % 24;
//                    }
                    //insert ดอกเบี้ยฝาก
                    CbTransactionSaveBean bean = new CbTransactionSaveBean();
                    bean.setT_date(data.getT_date());
                    bean.setT_time(data.getT_time());
                    bean.setT_acccode(accCode);
                    bean.setT_custcode(custCode);
                    bean.setT_description("ฝากเงิน(ดอกเบี้ย)");
                    bean.setT_amount(data.getDeposit_interest());
                    bean.setT_empcode("system");
                    bean.setT_docno("");
                    bean.setT_booktype("INT");
                    bean.setLineNo(0);
                    bean.setPrintChk("N");
                    bean.setT_balance(data.getBalance());
                    bean.setT_index(0);
                    bean.setMoney_in(data.getDeposit_interest());
                    bean.setMoney_out(0);
                    bean.setBranchCode(Value.BRANCH_CODE);
                    bean.setT_interest(0);
                    bean.setT_fee(0);
                    bean.setT_status("11");
                    if (bean.getT_amount() > 0) {
                        cbTransactionSaveControl.saveCbTransactionSave(bean);
                    }
                }
            }//end paytype 3

            if (!isDateIn) {
                data.setProfit(data.getBalance() - data.getPrinciple());
                if (addModel) {
                    modelList.add(data.toObject());
                }
            }

            if (isDateIn && isUpdate) {
                data.setProfit(data.getBalance() - data.getPrinciple());
                if (addModel) {
                    modelList.add(data.toObject());
                }
            }

            if (c.getTime().compareTo(dateEnd) == 0) {
                data.setProfit(data.getBalance() - data.getPrinciple());
                if (addModel) {
                    modelList.add(data.toObject());
                }
                isLoop = true;
            } else {
                c.add(Calendar.DATE, 1);
            }
        }//end while loop

        show3 = show1 - show2;
        show5 = show3 + show4;

        balanceAmount = all_balance;
        interestAmount = all_interest;

        return modelList;
    }

    static void updateTransactionSaveRunning(String custCode, String accCode) {
        int t_index = 1;
        int line_no = 1;
        CbTransactionSaveControl tranSaveControl = new CbTransactionSaveControl();
        List<CbTransactionSaveBean> listTrans = tranSaveControl.getListByAccoundCode(accCode);
        for (CbTransactionSaveBean bean : listTrans) {
            String t_date = DateFormat.getMySQL_DateTime(bean.getT_date());
            if (line_no > 24) {
                line_no = line_no % 24;
            }
            tranSaveControl.updateWhereAccountAndStatus(line_no, t_index, accCode, t_date, bean.getT_time());
            t_index++;
            line_no++;
        }
    }
}
