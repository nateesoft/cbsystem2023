package th.co.cbank.project.model;

import java.util.Date;
import lombok.Data;

@Data
public class CbSaveAccountBean {

    private String B_CUST_CODE;
    private String B_CUST_NAME;
    private String B_CUST_LASTNAME;
    private double B_BALANCE = 0.00;
    private double B_INTEREST = 0.000;
    private Date B_START;
    private String MEMBER_TYPE = "";
    private Date B_UPDATE;
    private String account_code;
    private String account_status = "";
    private String book_no = "";
    private String book_evidence1;
    private String book_evidence2;
    private String book_evidence3;
    private String book_evidence4;
    private String remark;
    private int hoon_balance;
    private String account_type;
    private String account_name;
    private String B_TIME;
    private double B_FEE;
    private String Branch_Code;
    private String Emp_Code;
    private String statusName;


}
