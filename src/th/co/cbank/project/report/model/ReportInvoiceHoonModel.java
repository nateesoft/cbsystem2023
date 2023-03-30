package th.co.cbank.project.report.model;

import java.util.Date;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoan_docno() {
        return loan_docno;
    }

    public void setLoan_docno(String loan_docno) {
        this.loan_docno = loan_docno;
    }

    public Date getLoan_docdate() {
        return loan_docdate;
    }

    public void setLoan_docdate(Date loan_docdate) {
        this.loan_docdate = loan_docdate;
    }

    public Date getLoan_datepay() {
        return loan_datepay;
    }

    public void setLoan_datepay(Date loan_datepay) {
        this.loan_datepay = loan_datepay;
    }

    public double getLoan_amount() {
        return loan_amount;
    }

    public void setLoan_amount(double loan_amount) {
        this.loan_amount = loan_amount;
    }

    public double getPay_amount() {
        return pay_amount;
    }

    public void setPay_amount(double pay_amount) {
        this.pay_amount = pay_amount;
    }

    public double getLoanINT() {
        return loanINT;
    }

    public void setLoanINT(double loanINT) {
        this.loanINT = loanINT;
    }

    public int getHoon_qty() {
        return hoon_qty;
    }

    public void setHoon_qty(int hoon_qty) {
        this.hoon_qty = hoon_qty;
    }

    public int getHoonrate() {
        return hoonrate;
    }

    public void setHoonrate(int hoonrate) {
        this.hoonrate = hoonrate;
    }

    public String getP_custcode() {
        return p_custcode;
    }

    public void setP_custcode(String p_custcode) {
        this.p_custcode = p_custcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBalanceIntRate() {
        return balanceIntRate;
    }

    public void setBalanceIntRate(int balanceIntRate) {
        this.balanceIntRate = balanceIntRate;
    }

}
