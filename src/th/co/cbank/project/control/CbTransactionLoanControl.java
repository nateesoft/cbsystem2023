package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import th.co.cbank.util.DateFormat;
import th.co.cbank.project.model.CbTransactionLoanBean;
import th.co.cbank.util.MessageAlert;
import th.co.cbank.util.NumberFormat;
import th.co.cbank.util.StringUtil;
import th.co.cbank.util.ThaiUtil;

public class CbTransactionLoanControl extends BaseControl {

    private final Logger logger = Logger.getLogger(CbTransactionLoanControl.class);

    public List<CbTransactionLoanBean> mappingBean(ResultSet rs) throws Exception {
        List<CbTransactionLoanBean> listBean = new ArrayList<>();
        while (rs.next()) {
            CbTransactionLoanBean bean = new CbTransactionLoanBean();
            bean.setT_date(rs.getDate("T_date"));
            bean.setT_time(rs.getString("T_time"));
            bean.setT_acccode(rs.getString("T_acccode"));
            bean.setT_custcode(rs.getString("T_custcode"));
            bean.setT_description(ThaiUtil.ASCII2Unicode(rs.getString("T_description")));
            bean.setT_amount(rs.getDouble("T_amount"));
            bean.setT_empcode(rs.getString("T_empcode"));
            bean.setT_docno(rs.getString("T_docno"));
            bean.setRemark(rs.getString("Remark"));
            bean.setT_booktype(rs.getString("T_booktype"));
            bean.setT_hoon(rs.getInt("T_hoon"));
            bean.setLineNo(rs.getInt("LineNo"));
            bean.setPrintChk(rs.getString("PrintChk"));
            bean.setT_balance(rs.getDouble("T_balance"));
            bean.setT_index(rs.getInt("T_index"));
            bean.setMoney_in(rs.getDouble("Money_in"));
            bean.setMoney_out(rs.getDouble("Money_out"));
            bean.setUpdate_interest(rs.getDate("Update_interest"));
            bean.setT_hoon_amt(rs.getDouble("T_hoon_amt"));
            bean.setT_hoon_cash(rs.getDouble("T_hoon_cash"));
            bean.setT_hoon_ton(rs.getDouble("T_hoon_ton"));
            bean.setT_hoon_rate(rs.getDouble("T_hoon_rate"));
            bean.setBranch_code(rs.getString("Branch_code"));
            bean.setT_interest(rs.getDouble("T_interest"));
            bean.setT_fee(rs.getDouble("T_fee"));
            bean.setT_status(rs.getString("T_status"));

            //เพิ่มใหม่
            bean.setT_loan_int_ar_lost(rs.getDouble("t_loan_int_ar_lost"));
            bean.setT_loan_int_ar_mgr(rs.getDouble("t_loan_int_ar_mgr"));
            bean.setT_loan_int_ar_int(rs.getDouble("t_loan_int_ar_int"));

            listBean.add(bean);
        }
        rs.close();

        return listBean;
    }

    public List<CbTransactionLoanBean> listCbTransactionLoan() {
        try {
            String sql = "select * from cb_transaction_loan";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ArrayList();
        }
    }

    public List<CbTransactionLoanBean> listTransactionLoan(String where) {
        try {
            String sql = "select * from cb_transaction_loan where 1=1 ";
            if (StringUtil.isNotNullString(where)) {
                sql += where;
            }
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ArrayList();
        }
    }

    public List<CbTransactionLoanBean> listCbTransactionLoan(String t_acccode) {
        try {
            String sql = "select * from cb_transaction_loan "
                    + "where t_acccode='" + t_acccode + "' order by LineNo";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ArrayList();
        }
    }

    public List<CbTransactionLoanBean> listCbTransactionLoanPayment(String t_acccode, String custCode) {
        try {
            String sql = "select * from cb_transaction_loan "
                    + "where t_acccode='" + t_acccode + "' "
                    + "and t_custcode='" + custCode + "' "
                    + "and t_status in('7') order by LineNo";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ArrayList();
        }
    }

    public List<CbTransactionLoanBean> listCbTransactionLoanAll(String accCode, boolean filterPrintCheck) {
        try {
            String addSql = "";
            if (filterPrintCheck) {
                addSql = " and PrintChk='N' ";
            }
            String sql = "select * from cb_transaction_loan "
                    + "where t_acccode='" + accCode + "' "
                    + "and LineNo>0 "
                    + addSql
                    + "and t_status in('10','7') order by t_index";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ArrayList();
        }
    }

    public CbTransactionLoanBean getCbTransactionLoan(String t_date) {
        try {
            String sql = "select * from cb_transaction_loan where t_date='" + t_date + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            List<CbTransactionLoanBean> listBean = mappingBean(rs);
            if (listBean.isEmpty()) {
                return null;
            }
            return listBean.get(0);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return null;
        }
    }

    public boolean saveCbTransactionLoan(CbTransactionLoanBean bean) {
        try {
            String sql = "insert into cb_transaction_loan "
                    + "(t_date,t_time,t_acccode,t_custcode,t_description,t_amount,t_empcode,t_docno,remark,"
                    + "t_booktype,t_hoon,LineNo,PrintChk,t_balance,t_index,money_in,money_out,update_interest,"
                    + "t_hoon_amt,t_hoon_cash,t_hoon_ton,t_hoon_rate,branch_code,t_interest,t_fee,t_status,"
                    + "t_loan_int_ar_lost,t_loan_int_ar_mgr,t_loan_int_ar_int)  "
                    + "values('" + DateFormat.getMySQL_Date(bean.getT_date()) + "',curtime(),'" + bean.getT_acccode() + "',"
                    + "'" + bean.getT_custcode() + "','" + ThaiUtil.Unicode2ASCII(bean.getT_description()) + "','" + bean.getT_amount() + "',"
                    + "'" + bean.getT_empcode() + "','" + bean.getT_docno() + "','" + bean.getRemark() + "',"
                    + "'" + bean.getT_booktype() + "','" + bean.getT_hoon() + "','" + bean.getLineNo() + "',"
                    + "'" + bean.getPrintChk() + "','" + bean.getT_balance() + "','" + bean.getT_index() + "',"
                    + "'" + bean.getMoney_in() + "','" + bean.getMoney_out() + "',curdate(),"
                    + "'" + bean.getT_hoon_amt() + "','" + bean.getT_hoon_cash() + "','" + bean.getT_hoon_ton() + "',"
                    + "'" + bean.getT_hoon_rate() + "','" + bean.getBranch_code() + "','" + bean.getT_interest() + "',"
                    + "'" + bean.getT_fee() + "','" + bean.getT_status() + "',"
                    + "'" + bean.getT_loan_int_ar_lost() + "','" + bean.getT_loan_int_ar_mgr() + "','" + bean.getT_loan_int_ar_int() + "')";
            update(sql);
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return false;
    }

    public int getLineByAccount(String AccCode) {
        int LineMax = 1;
        try {
            String sql = "select max(t_index)+1 as MaxLineNO "
                    + "from cb_transaction_loan "
                    + "where t_acccode='" + AccCode + "' ";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                LineMax = rs.getInt("MaxLineNO");
                if (LineMax > 24) {
                    LineMax = LineMax % 24;
                }
            }

            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        if (LineMax == 0) {
            LineMax = 1;
        }

        return LineMax;
    }

    public int getMaxIndex(String AccCode) {
        int LineMax = 1;
        try {
            String sql = "select max(t_index)+1 as MaxLineNO "
                    + "from cb_transaction_loan "
                    + "where t_acccode='" + AccCode + "' ";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                LineMax = rs.getInt("MaxLineNO");
            }

            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        if (LineMax == 0) {
            LineMax = 1;
        }

        return LineMax;
    }

    public void updateLinePrint(String t_acccode, int lineNo) {
        try {
            String sql = "update cb_transaction_loan set "
                    + "PrintChk='Y' "
                    + "where t_acccode='" + t_acccode + "' "
                    + "and lineNo='" + lineNo + "'";
            update(sql);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public List<Object[]> getTransactionListWhereCustCode(String custCode) {
        List<Object[]> list = new ArrayList();
        try {
            String sql = "select t_date, t_time, t_custcode, t_acccode, t_balance, "
                    + "t_amount,t_interest,t_description "
                    + "from cb_transaction_loan "
                    + "where t_custcode='" + custCode + "' "
                    + "order by t_date, t_time";
            ResultSet rs1 = MySQLConnect.getResultSet(sql);
            while (rs1.next()) {
                list.add(new Object[]{
                    rs1.getString("t_acccode"),
                    rs1.getString("t_date") + " " + rs1.getString("t_time"),
                    ThaiUtil.ASCII2Unicode(rs1.getString("t_description")),
                    NumberFormat.showDouble2(rs1.getString("t_amount")),
                    NumberFormat.showDouble2(rs1.getString("t_interest")),
                    NumberFormat.showDouble2(rs1.getString("t_balance"))
                });
            }
            rs1.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return list;
    }

    public boolean updateLoanState(CbTransactionLoanBean bean) {
        try {
            String sql = "UPDATE cb_transaction_loan "
                    + "SET PrintChk= 'N' "
                    + "WHERE t_acccode='" + bean.getT_acccode() + "' "
                    + "AND LineNo='" + bean.getLineNo() + "' "
                    + "and t_status in('10','7') "
                    + "AND t_docno='" + bean.getT_docno() + "' "
                    + "AND t_booktype='" + bean.getT_booktype() + "'";
            return MySQLConnect.exeUpdate(sql) > 0;
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
        return false;
    }
}
