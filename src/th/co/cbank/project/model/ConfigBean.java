package th.co.cbank.project.model;

import java.util.Date;
import lombok.Data;

@Data
public class ConfigBean {

    private String SaveDocType;
    private String SaveDocPrefix;
    private int SaveDocRunning = 1;
    private String HoonDocType;
    private String HoonDocPrefix;
    private int HoonDocRunning = 1;
    private String LoanDocType;
    private String LoanDocPrefix;
    private int LoanDocRunning = 1;
    private String PrinterPassBook;
    private String PrintSlipType = "DR";
    private String PrintSlipDriverName;
    private String PrintSlipPort;
    private String AccountDocType;
    private String AccountPrefix;
    private int AccountRunning = 1;
    private Date ProgramStartDate;
    private int NoteNo;
    private String BranchPrefix = "N";
    private String WithdrawDocPrefix;
    private int WithdrawDocRunning = 0;
    private String IntDocPrefix;
    private int IntDocRunning = 0;
    private String HoonSaleDocPrefix;
    private int HoonSaleDocRunning = 0;
    private String CompoundDocPrefix;
    private int CompoundDocRunning = 0;
    private String PaymentDocPrefix;
    private int PaymentDocRunning;
    private String FeePrefix;
    private double FeeAmt;
    private int FeeRunning;
    private String HoonTransferDocPrefix;
    private int HoonTransferDocRunning = 0;
    private int BookSpec = 0;

}
