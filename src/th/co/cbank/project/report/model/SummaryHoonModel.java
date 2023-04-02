package th.co.cbank.project.report.model;

public class SummaryHoonModel {

    private String t_status;
    private double sumAmount;
    private double sumHoonAmt;

    public String getT_status() {
        return t_status;
    }

    public void setT_status(String t_status) {
        this.t_status = t_status;
    }

    public double getSumAmount() {
        return sumAmount;
    }

    public void setSumAmount(double sumAmount) {
        this.sumAmount = sumAmount;
    }

    public double getSumHoonAmt() {
        return sumHoonAmt;
    }

    public void setSumHoonAmt(double sumHoonAmt) {
        this.sumHoonAmt = sumHoonAmt;
    }

}
