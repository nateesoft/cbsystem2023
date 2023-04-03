package th.co.cbank.project.report.model;

import lombok.Data;

@Data
public class SummaryDepositModel {

    private double sumMoneyIn;
    private double sumMoneyOut;
    private double sumMoneyBalance;
    private double sumInterest;
    private double sumFee;

}
