package th.co.cbank.project.report.model;

import java.util.Date;

public class SaveReportAllModel {

    private double t_amount;
    private Date t_date;
    private String t_time;
    private String t_acccode;
    private String t_description;
    private double t_balance;
    private String t_custcode;
    private String b_cust_name;
    private String b_cust_lastname;
    private String t_empcode;
    private String branch_code;

    public double getT_amount() {
        return t_amount;
    }

    public void setT_amount(double t_amount) {
        this.t_amount = t_amount;
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

    public String getT_acccode() {
        return t_acccode;
    }

    public void setT_acccode(String t_acccode) {
        this.t_acccode = t_acccode;
    }

    public String getT_description() {
        return t_description;
    }

    public void setT_description(String t_description) {
        this.t_description = t_description;
    }

    public double getT_balance() {
        return t_balance;
    }

    public void setT_balance(double t_balance) {
        this.t_balance = t_balance;
    }

    public String getT_custcode() {
        return t_custcode;
    }

    public void setT_custcode(String t_custcode) {
        this.t_custcode = t_custcode;
    }

    public String getB_cust_name() {
        return b_cust_name;
    }

    public void setB_cust_name(String b_cust_name) {
        this.b_cust_name = b_cust_name;
    }

    public String getB_cust_lastname() {
        return b_cust_lastname;
    }

    public void setB_cust_lastname(String b_cust_lastname) {
        this.b_cust_lastname = b_cust_lastname;
    }

    public String getT_empcode() {
        return t_empcode;
    }

    public void setT_empcode(String t_empcode) {
        this.t_empcode = t_empcode;
    }

    public String getBranch_code() {
        return branch_code;
    }

    public void setBranch_code(String branch_code) {
        this.branch_code = branch_code;
    }

}
