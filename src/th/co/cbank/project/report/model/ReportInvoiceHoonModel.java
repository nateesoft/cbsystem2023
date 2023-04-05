package th.co.cbank.project.report.model;

import java.util.Date;
import lombok.Data;

@Data
public class ReportInvoiceHoonModel {

    private String name;
    private String loan_docno;
    private Date loan_docdate;
    private Date loan_datepay;
    private double loan_amount;
    private double pay_amount;
    private double loanINT;
    private int hoon_qty;
    private int hoonrate;
    private int balanceIntRate;
    private String p_custcode;
    private String address;

}
