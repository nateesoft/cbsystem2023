package th.co.cbank.project.model;

import java.util.Date;
import th.co.cbank.util.DateFormat;
import th.co.cbank.util.NumberFormat;

public class ItemRows {

    private Date t_date;
    private String t_time;
    private String t_docno;
    private int t_day;
    private double t_interest;
    private double t_interest_balance;//ยอดยกมา
    private double deposit;
    private double deposit_interest;
    private double withdraw;
    private double balance;
    private double principle;//เงินต้น
    private String remark;
    private double profit;
    private double interest_rate;//อัตราดอกเบี้ยต่อปี
    private String isPrint = "N";
    private String LineNo = "";

    public ItemRows() {
    }

    public ItemRows(Date t_date, String t_time, String t_docno, int t_day, double t_interest,
            double t_interest_balance, double deposit, double deposit_interest, double withdraw,
            double balance, double principle, String remark, double profit, double interest_rate,
            String isPrint, String LineNo) {
        this.t_date = t_date;
        this.t_time = t_time;
        this.t_docno = t_docno;
        this.t_day = t_day;
        this.t_interest = t_interest;
        this.t_interest_balance = t_interest_balance;
        this.deposit = deposit;
        this.deposit_interest = deposit_interest;
        this.withdraw = withdraw;
        this.balance = balance;
        this.principle = principle;
        this.remark = remark;
        this.profit = profit;
        this.interest_rate = interest_rate;
        this.isPrint = isPrint;
        this.LineNo = LineNo;
    }

    public Object[] toObject() {
        String data = "";
        data += remark + "_";
        data += DateFormat.getLocale_ddMMyyyy(t_date) + "_";
        data += t_time + "_";
        data += t_docno + "_";
        data += t_day + "_";
        data += NumberFormat.showDouble4(t_interest) + "_";
        data += NumberFormat.showDouble4(t_interest_balance) + "_";
        data += NumberFormat.showDouble2(deposit) + "_";
        data += NumberFormat.showDouble2(deposit_interest) + "_";
        data += NumberFormat.showDouble2(withdraw) + "_";
        data += NumberFormat.showDouble2(balance) + "_";
        data += NumberFormat.showDouble2(principle) + "_";
        data += NumberFormat.showDouble2(profit) + "_";
        data += NumberFormat.showDouble2(interest_rate) + "_";
        data += isPrint + "_";
        data += LineNo + "_";

        return data.split("_");
    }

    public String getLineNo() {
        return LineNo;
    }

    public void setLineNo(String LineNo) {
        this.LineNo = LineNo;
    }

    public Date getT_date() {
        return t_date;
    }

    public void setT_date(Date t_date) {
        this.t_date = t_date;
    }

    public String getT_time() {
        return t_time;
    }

    public void setT_time(String t_time) {
        this.t_time = t_time;
    }

    public String getT_docno() {
        return t_docno;
    }

    public void setT_docno(String t_docno) {
        this.t_docno = t_docno;
    }

    public int getT_day() {
        return t_day;
    }

    public void setT_day(int t_day) {
        this.t_day = t_day;
    }

    public double getT_interest() {
        return t_interest;
    }

    public void setT_interest(double t_interest) {
        this.t_interest = t_interest;
    }

    public double getT_interest_balance() {
        return t_interest_balance;
    }

    public void setT_interest_balance(double t_interest_balance) {
        this.t_interest_balance = t_interest_balance;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getDeposit_interest() {
        return deposit_interest;
    }

    public void setDeposit_interest(double deposit_interest) {
        this.deposit_interest = deposit_interest;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getPrinciple() {
        return principle;
    }

    public void setPrinciple(double principle) {
        this.principle = principle;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public double getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(double interest_rate) {
        this.interest_rate = interest_rate;
    }

    public String isIsPrint() {
        return isPrint;
    }

    public void setIsPrint(String isPrint) {
        this.isPrint = isPrint;
    }

}
