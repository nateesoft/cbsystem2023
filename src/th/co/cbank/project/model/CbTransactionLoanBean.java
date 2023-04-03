package th.co.cbank.project.model;

import java.util.Date;
import lombok.Data;

@Data
public class CbTransactionLoanBean {

    private Date t_date;
    private String t_time = "00:00:00";
    private String t_acccode;
    private String t_custcode;
    private String t_description;
    private double t_amount = 0.00;
    private String t_empcode;
    private String t_docno;
    private String remark;
    private String t_booktype;
    private int t_hoon = 1;
    private int LineNo = 1;
    private String PrintChk = "N";
    private double t_balance = 0.00;
    private int t_index = 1;
    private double money_in = 0.00;
    private double money_out = 0.00;
    private Date update_interest;
    private double t_hoon_amt = 0.00;
    private double t_hoon_cash = 0.00;
    private double t_hoon_ton = 0.00;
    private double t_hoon_rate = 0.00;
    private String branch_code;
    private double t_interest;
    private double t_fee = 0.00;
    private String t_status;
    private double t_loan_int_ar_lost;
    private double t_loan_int_ar_mgr;
    private double t_loan_int_ar_int;

}
