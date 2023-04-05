package th.co.cbank.project.model;

import java.util.Date;
import lombok.Data;

@Data
public class CbLoanAccountBean {

    private String loan_docno;
    private String loan_name;
    private String cust_code;
    private Date loan_docdate;
    private String branch_code;
    private double loan_amount = 0.00;
    private double loan_interest = 0.00;
    private Date loan_datePay;
    private double loan_fee = 0.00;
    private Date sysdate;
    private int ID = 1;
    private double pay_amount = 0.00;
    private Date pay_date;
    private String pay_time = "00:00:00";
    private String pay_user;
    private double pay_ton = 0.00;
    private String loan_person1;
    private String loan_person2;
    private double pay_interest = 0.00;
    private String book_evidence1;
    private String book_evidence2;
    private String book_evidence3;
    private String book_evidence4;
    private String book_no;
    private String loan_type;
    private Date loan_start_date;
    private Date loan_end_date;
    private double payPerAmount = 0.00;
    private int period_pay = 0;
    private String chkPersonApprove = "N";
    private double LoanCustomerPay = 0.00;
    private int LoanDayQty = 0;
    private double LoanPayMin = 0.00;
    private double intBalance = 0.00;
    private ProfileBean profile;

}
