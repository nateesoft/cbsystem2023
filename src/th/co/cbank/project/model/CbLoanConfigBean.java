package th.co.cbank.project.model;

import lombok.Data;

@Data
public class CbLoanConfigBean {

    private String LoanCode;
    private String LoanName;
    private double LoanINT = 0.00;
    private double LoanFee = 0.00;
    private double LoanPenaltyINT = 0.00;
    private int LoanPenaltyDay = 7;
    private double LoanMinAmount = 0.00;
    private String IntFixed = "1";
    private double IntBadDebt = 0.00;
    private double IntTurnover = 0.00;
    private double IntNormal = 0.00;
    private String chkPIntCapital = "1";
    private String chkPIntTable = "1";
    private int loanPerMonth = 0;
    private int LoanRunning;
    private int BookNo;
    private String checkMinPayment = "N";
    private double minPaymentPercent = 0;
    private double minPaymentBaht = 0.00;

}
