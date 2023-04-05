package th.co.cbank.project.model;

import lombok.Data;

@Data
public class CbSaveConfigBean {

    private String TypeCode;
    private String TypeName;
    private double TypeINT = 0.00;
    private String TypeCondition = "1";
    private double RDType2 = 0.00;
    private int cbRDType2 = 0;
    private String rdTypeDialy = "D";
    private String payType = "1";
    private int cbPayType1 = 0;
    private int cbPayType2 = 0;
    private int cbPayType3 = 0;
    private int cbPayType4 = 0;
    private int cbPayType5 = 0;
    private int cbPayType6 = 0;
    private int cbPayType7 = 0;
    private double PayINT = 0.00;
    private String accCode;
    private double FundINT = 0.00;
    private double MaxDeposit = 999999999.00;
    private double TAX = 0.00;
    private int saveRunning;
    private int noRunning;
    private double SaveFee = 0.00;
    private double minDeposit = 0.00;
    private double minWitdraw = 0.00;
    private String create_date;
    private String update_date;
}
