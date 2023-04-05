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
import th.co.cbank.util.MessageAlert;

public class TransactionAdvanceMethod {

    private static CbSaveConfigControl saveConfigControl = new CbSaveConfigControl();
    private static CbTransactionLoanControl tranLoanControl = new CbTransactionLoanControl();
    private static CbTransactionSaveControl tranSaveControl = new CbTransactionSaveControl();
    private static CbSaveAccountControl saveAccountControl = new CbSaveAccountControl();

    public static double balanceAmount = 0;
    public static double interestAmount = 0;

    public static void updateSaveAccountAndProfile(String custCode, String accCode, double netBalance, double textInt) {
        saveAccountControl.updateSaveAccountAndProfile(netBalance, textInt, custCode, accCode);
        saveAccountControl.updateSaveAccountInProfile(accCode, custCode);
    }

    public static double depositSummary = 0.00;
    public static double withdrawSummary = 0.00;
    public static double balanceSummary = 0.00;
    public static double profitSummary = 0.00;
    public static double netBalanceSummary = 0.00;

    public static List findData(String custCode, String accCode, boolean addModel, String accountType) {
        double show1 = 0.00;//ฝาก
        double show2 = 0.00;//ถอน
        double show3 = 0.00;//คงเหลือ
        double show4 = 0.00;//กำไรทบต้น
        double show5 = 0.00;//ยอดเงินสุทธิ

        balanceAmount = 0;
        interestAmount = 0;

        List modelList = new ArrayList<>();
        String date = "";
        List<CbTransactionSaveBean> listTransactionSaveReport = tranSaveControl.getTdateList(custCode, accCode);
        for (CbTransactionSaveBean bean : listTransactionSaveReport) {
            date += DateFormat.getLocale_ddMMyyyy(bean.getT_date()) + ",";
        }
        date += DateFormat.getLocale_ddMMyyyy(new Date());

        //add to model
        String[] dateTransaction = date.split(",");
        Date dateStart = DateFormat.getLocal_ddMMyyyy(dateTransaction[0]);
        Date dateEnd = DateFormat.getLocal_ddMMyyyy(dateTransaction[dateTransaction.length - 1]);

        Calendar currentTime = Calendar.getInstance();
        currentTime.setTime(dateStart);

        boolean isLoop = false;
        List<CbSaveConfigBean> listSaveConfig = saveConfigControl.listSaveConfigHistory();
        if (listSaveConfig.isEmpty()) {
            MessageAlert.errorPopup(TransactionAdvanceMethod.class, "ไม่พบข้อมูล Save Configuration!!!");
            return new ArrayList<>();
        }
        int dayCount = 0;
        String temp_date = "";

        double all_balance = 0.00;//เก็บยอดเงิน balance
        double all_interest = 0.00;//เก็บยอดยกมาของดอกเบี้ย
        double all_money = 0.00;//เงินต้น
        int lineNo = 0;

        while (!isLoop) {
            String dateStr = DateFormat.getLocale_ddMMyyyy(currentTime.getTime());
            if (temp_date.equals("")) {
                temp_date = dateStr;
            }
            if (!temp_date.equals(dateStr)) {
                dayCount++;
            }

//            CbSaveConfigBean saveConfigBean = getSaveConfigByDateFromDB(currentTime.getTime(), accountType);
            CbSaveConfigBean saveConfigBean = getSaveConfigByDate(currentTime.getTime(), listSaveConfig);

            ItemRows itemRow = new ItemRows();
            itemRow.setT_date(currentTime.getTime());
            itemRow.setT_time("");
            itemRow.setT_docno("");
            itemRow.setRemark("");
            itemRow.setInterest_rate(saveConfigBean.getTypeINT());
            itemRow.setT_day(dayCount);
            itemRow.setBalance(all_balance);
            itemRow.setT_interest((itemRow.getT_day() * itemRow.getInterest_rate() * all_balance) / (36500));
            itemRow.setT_interest_balance(all_interest);
            itemRow.setPrinciple(all_money);

            boolean isDateIn = false;
            for (String dateLoop : dateTransaction) {
                if (dateLoop.equals(DateFormat.getLocale_ddMMyyyy(currentTime.getTime()))) {
                    List<CbTransactionSaveBean> listBean = tranSaveControl.getTransaction(custCode, accCode, currentTime.getTime());
                    double temp_all_interest = all_interest;

                    for (CbTransactionSaveBean transactionSaveBean : listBean) {
                        ItemRows itemRow2 = new ItemRows();
                        itemRow2.setInterest_rate(saveConfigBean.getTypeINT());
                        itemRow2.setT_day(0);

                        itemRow2.setT_date(transactionSaveBean.getT_date());
                        itemRow2.setT_time(transactionSaveBean.getT_time());
                        itemRow2.setT_docno(transactionSaveBean.getT_docno());
                        all_balance += transactionSaveBean.getT_amount();
                        if (all_balance < 1) {
                            all_balance = 0;
                        }

                        //เก็บเฉพาะเงินต้น
                        all_money += transactionSaveBean.getT_amount();
                        itemRow2.setPrinciple(all_money);
                        itemRow2.setBalance(all_balance);
                        itemRow2.setT_interest((itemRow2.getT_day() * itemRow2.getInterest_rate() * all_balance) / (36500));

                        all_interest = itemRow.getT_interest() + temp_all_interest;
                        //temp_all_interest = 0;

                        if (transactionSaveBean.getT_amount() >= 0) {
                            itemRow2.setDeposit(transactionSaveBean.getT_amount());
                            itemRow2.setRemark("<html><font color=blue><b>ฝากเงิน</b></font></html>");
                            show1 += transactionSaveBean.getT_amount();
                            itemRow2.setT_interest_balance(all_interest);
                        } else {
                            itemRow2.setWithdraw(transactionSaveBean.getT_amount());
                            itemRow2.setRemark("<html><font color=red><b>ถอนเงิน</b></font></html>");
                            show2 += transactionSaveBean.getT_amount() * -1;
                            itemRow2.setT_interest_balance(all_interest);
                        }

                        itemRow2.setIsPrint("Y");
                        lineNo++;

                        itemRow2.setLineNo("" + lineNo);
                        itemRow2.setProfit(itemRow2.getBalance() - itemRow2.getPrinciple());
                        if (addModel) {
                            modelList.add(itemRow2.toObject());
                        }

                        //update recode
                        tranSaveControl.updateWhereCustCodeAccode(itemRow2.getBalance(), custCode, accCode, itemRow2.getT_docno(), itemRow2.getT_time());
                    }

                    isDateIn = true;
                    dayCount = 0;
                    break;
                }
            }

            boolean isUpdate = false;
            //check เงื่อนไขการจ่ายดอกเบี้ยเพิ่ม
            if (saveConfigBean.getPayType().equals("2")) {
                int dd_db1 = saveConfigBean.getCbPayType1() + 1;//เนื่องจากในฐานข้อมูลเก็บเป็น index ของ combobox เริ่มจาก 0
                int mm_db1 = saveConfigBean.getCbPayType2();
                Calendar c1 = Calendar.getInstance(Locale.ENGLISH);
                c1.setTime(currentTime.getTime());//เอาปีของความเคลื่อนไหวก่อนหน้า เพื่อเลือกวันที่คำนวณ
                c1.set(Calendar.DATE, dd_db1);
                c1.set(Calendar.MONTH, mm_db1);
                if (c1.getTime().compareTo(currentTime.getTime()) == 0) {
                    itemRow.setT_time("00:00:00");
                    itemRow.setRemark("<html><font color=green><b>ดอกเบี้ยทบเงินต้น</b></font></html>");
                    itemRow.setIsPrint("Y");
                    lineNo++;
                    itemRow.setLineNo("" + lineNo);

                    itemRow.setBalance(all_balance + itemRow.getT_interest() + itemRow.getT_interest_balance());
                    itemRow.setDeposit_interest(itemRow.getT_interest() + itemRow.getT_interest_balance());
                    show4 += itemRow.getDeposit_interest();
                    itemRow.setT_interest_balance(0);
                    all_interest = 0;//clear ดอกเบี้ยทบต้นออก
                    itemRow.setT_interest(0);
                    dayCount = 0;
                    all_balance = itemRow.getBalance();
                    isUpdate = true;

                    //insert ดอกเบี้ยฝาก
                    int lineNoInterest = tranLoanControl.getLineByAccount(accCode);
                    int tIndex = lineNoInterest;
                    if (tIndex > 24) {
                        tIndex = tIndex % 24;
                    }
                    CbTransactionSaveBean bean = new CbTransactionSaveBean();
                    bean.setT_date(itemRow.getT_date());
                    bean.setT_time(itemRow.getT_time());
                    bean.setT_acccode(accCode);
                    bean.setT_custcode(custCode);
                    bean.setT_description("ฝากเงิน(ดอกเบี้ย)");
                    bean.setT_amount(itemRow.getDeposit_interest());
                    bean.setT_empcode("system");
                    bean.setT_docno("");
                    bean.setT_booktype("INT");
                    bean.setLineNo(lineNoInterest);
                    bean.setPrintChk("N");
                    bean.setT_balance(itemRow.getBalance());
                    bean.setT_index(tIndex);
                    bean.setMoney_in(itemRow.getDeposit_interest());
                    bean.setMoney_out(0);
                    bean.setBranchCode(Value.BRANCH_CODE);
                    bean.setT_interest(0);
                    bean.setT_fee(0);
                    bean.setT_status("11");

                    if (bean.getT_amount() > 0) {
                        tranSaveControl.saveCbTransactionSave(bean);
                    }
                }
            } else if (saveConfigBean.getPayType().equals("3")) {
                //ช่วงที่ 1
                int dd_db1 = saveConfigBean.getCbPayType3() + 1;//เนื่องจากในฐานข้อมูลเก็บเป็น index ของ combobox เริ่มจาก 0
                int mm_db1 = saveConfigBean.getCbPayType4();
                Calendar c1 = Calendar.getInstance(Locale.ENGLISH);
                c1.setTime(currentTime.getTime());//เอาปีของความเคลื่อนไหวก่อนหน้า เพื่อเลือกวันที่คำนวณ
                c1.set(Calendar.DATE, dd_db1);
                c1.set(Calendar.MONTH, mm_db1);
                //จบช่วงที่ 1

                //ช่วงที่ 2
                int dd_db2 = saveConfigBean.getCbPayType5() + 1;//เนื่องจากในฐานข้อมูลเก็บเป็น index ของ combobox เริ่มจาก 0
                int mm_db2 = saveConfigBean.getCbPayType6();
                Calendar c2 = Calendar.getInstance(Locale.ENGLISH);
                c2.setTime(currentTime.getTime());//เอาปีของความเคลื่อนไหวก่อนหน้า เพื่อเลือกวันที่คำนวณ
                c2.set(Calendar.DATE, dd_db2);
                c2.set(Calendar.MONTH, mm_db2);
                //จบช่วงที่ 2

                if (c1.getTime().compareTo(currentTime.getTime()) == 0 || c2.getTime().compareTo(currentTime.getTime()) == 0) {
                    itemRow.setT_time("00:00:00");
                    itemRow.setRemark("<html><font color=green><b>ดอกเบี้ยทบเงินต้น</b></font></html>");
                    itemRow.setIsPrint("Y");
                    lineNo++;
                    itemRow.setLineNo("" + lineNo);
                    if (all_balance < 1) {
                        itemRow.setBalance(0);
                        itemRow.setT_interest(0);
                        itemRow.setT_interest_balance(0);
                    } else {
                        itemRow.setBalance(all_balance + itemRow.getT_interest() + itemRow.getT_interest_balance());
                    }
                    itemRow.setDeposit_interest(itemRow.getT_interest() + itemRow.getT_interest_balance());
                    show4 += itemRow.getDeposit_interest();
                    itemRow.setT_interest_balance(0);
                    all_interest = 0;//clear ดอกเบี้ยทบต้นออก
                    itemRow.setT_interest(0);
                    dayCount = 0;
                    all_balance = itemRow.getBalance();
                    isUpdate = true;

                    //insert ดอกเบี้ยฝาก
//                    int lineNo = cbTransactionSaveControl.getLineByAccount(accCode);
//                    int tIndex = lineNo;
//                    if (tIndex > 24) {
//                        tIndex = tIndex % 24;
//                    }
                    //insert ดอกเบี้ยฝาก
                    CbTransactionSaveBean bean = new CbTransactionSaveBean();
                    bean.setT_date(itemRow.getT_date());
                    bean.setT_time(itemRow.getT_time());
                    bean.setT_acccode(accCode);
                    bean.setT_custcode(custCode);
                    bean.setT_description("ฝากเงิน(ดอกเบี้ย)");
                    bean.setT_amount(itemRow.getDeposit_interest());
                    bean.setT_empcode("system");
                    bean.setT_docno("");
                    bean.setT_booktype("INT");
                    bean.setLineNo(0);
                    bean.setPrintChk("N");
                    bean.setT_balance(itemRow.getBalance());
                    bean.setT_index(0);
                    bean.setMoney_in(itemRow.getDeposit_interest());
                    bean.setMoney_out(0);
                    bean.setBranchCode(Value.BRANCH_CODE);
                    bean.setT_interest(0);
                    bean.setT_fee(0);
                    bean.setT_status("11");
                    if (bean.getT_amount() > 0) {
                        tranSaveControl.saveCbTransactionSave(bean);
                    }
                }
            }//end paytype 3

            if (!isDateIn) {
                itemRow.setProfit(itemRow.getBalance() - itemRow.getPrinciple());
                if (addModel) {
                    modelList.add(itemRow.toObject());
                }
            }

            if (isDateIn && isUpdate) {
                itemRow.setProfit(itemRow.getBalance() - itemRow.getPrinciple());
                if (addModel) {
                    modelList.add(itemRow.toObject());
                }
            }

            if (currentTime.getTime().compareTo(dateEnd) == 0) {
                itemRow.setProfit(itemRow.getBalance() - itemRow.getPrinciple());
                if (addModel) {
                    modelList.add(itemRow.toObject());
                }
                isLoop = true;
            } else {
                currentTime.add(Calendar.DATE, 1);
            }
        }//end while loop

        show3 = show1 - show2;
        show5 = show3 + show4;

        balanceAmount = all_balance;
        interestAmount = all_interest;

        TransactionAdvanceMethod.depositSummary = show1;
        TransactionAdvanceMethod.withdrawSummary = show2;
        TransactionAdvanceMethod.balanceSummary = show3;
        TransactionAdvanceMethod.profitSummary = show4;
        TransactionAdvanceMethod.netBalanceSummary = balanceAmount;

        return modelList;
    }

    static void updateTransactionSaveRunning(String custCode, String accCode) {
        int t_index = 1;
        int line_no = 1;
        List<CbTransactionSaveBean> listTrans = tranSaveControl.getListByAccoundCode(accCode, custCode);
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
    
    private static CbSaveConfigBean getSaveConfigByDate(Date dateCheck, List<CbSaveConfigBean> listSaveConfig) {
        CbSaveConfigBean saveConfigBean = new CbSaveConfigBean();
        for (CbSaveConfigBean bean : listSaveConfig) {
            Date updateDb = DateFormat.getMySQL_DateTime(bean.getUpdate_date());
            //ถ้าอยู่ระหว่าง createDate กับ updateDate ให้ return config เลย
            if (updateDb.before(dateCheck)) {
                saveConfigBean = bean;
            }
        }
        return saveConfigBean;
    }

    private static CbSaveConfigBean getSaveConfigByDateFromDB(Date dateCheck, String typeCode) {
        CbSaveConfigBean saveConfigBean = saveConfigControl.getLastConfigHistory(dateCheck, typeCode);
        return saveConfigBean;
    }
}
