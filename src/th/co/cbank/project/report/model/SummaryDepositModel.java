package th.co.cbank.project.report.model;

public class SummaryDepositModel {

    private double sumMoneyIn;
    private double sumMoneyOut;
    private double sumMoneyBalance;
    private double sumInterest;
    private double sumFee;

    public double getSumMoneyIn() {
        return sumMoneyIn;
    }

    public void setSumMoneyIn(double sumMoneyIn) {
        this.sumMoneyIn = sumMoneyIn;
    }

    public double getSumMoneyOut() {
        return sumMoneyOut;
    }

    public void setSumMoneyOut(double sumMoneyOut) {
        this.sumMoneyOut = sumMoneyOut;
    }

    public double getSumMoneyBalance() {
        return sumMoneyBalance;
    }

    public void setSumMoneyBalance(double sumMoneyBalance) {
        this.sumMoneyBalance = sumMoneyBalance;
    }

    public double getSumInterest() {
        return sumInterest;
    }

    public void setSumInterest(double sumInterest) {
        this.sumInterest = sumInterest;
    }

    public double getSumFee() {
        return sumFee;
    }

    public void setSumFee(double sumFee) {
        this.sumFee = sumFee;
    }

}
