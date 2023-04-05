package th.co.cbank.project.model;

import java.util.Date;
import lombok.Data;

@Data
public class CbLoanTablePaymentBean {

    private String loan_doc_no;
    private int loan_index = 0;
    private double loan_int_ar_lost = 0.00;
    private double loan_int_ar_mgr = 0.00;
    private double loan_int_ar_int = 0.00;
    private double net_total_pay = 0.00;
    private double payment_money = 0.00;
    private double payment_balance = 0.00;
    private double payment_fee = 0.00;
    private double base_total_amount = 0.00;
    private double table_avg_compute = 0.00;
    private double balance_amount = 0.00;
    private Date due_date;
    private Date sys_date;
    private String sys_time;
    private String emp_code;
    private String branch_code;

}
