package th.co.cbank.project.report.model;

import java.util.Date;

public class LoanReportAllModel {

    private String t_custcode;
    private Date t_date;
    private String t_time;
    private String p_custName;
    private String p_custSurname;
    private String t_description;
    private double t_amount;
    private int period_pay;
    private double payPerAmount;
    private String t_empcode;
    private String code;

    public String getT_custcode() {
        return t_custcode;
    }

    public void setT_custcode(String t_custcode) {
        this.t_custcode = t_custcode;
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

    public String getP_custName() {
        return p_custName;
    }

    public void setP_custName(String p_custName) {
        this.p_custName = p_custName;
    }

    public String getT_description() {
        return t_description;
    }

    public void setT_description(String t_description) {
        this.t_description = t_description;
    }

    public double getT_amount() {
        return t_amount;
    }

    public void setT_amount(double t_amount) {
        this.t_amount = t_amount;
    }

    public int getPeriod_pay() {
        return period_pay;
    }

    public void setPeriod_pay(int period_pay) {
        this.period_pay = period_pay;
    }

    public double getPayPerAmount() {
        return payPerAmount;
    }

    public void setPayPerAmount(double payPerAmount) {
        this.payPerAmount = payPerAmount;
    }

    public String getT_empcode() {
        return t_empcode;
    }

    public void setT_empcode(String t_empcode) {
        this.t_empcode = t_empcode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getP_custSurname() {
        return p_custSurname;
    }

    public void setP_custSurname(String p_custSurname) {
        this.p_custSurname = p_custSurname;
    }

}
