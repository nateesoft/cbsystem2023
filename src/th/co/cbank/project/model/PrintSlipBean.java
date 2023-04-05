package th.co.cbank.project.model;

import lombok.Data;

@Data
public class PrintSlipBean {

    // ชื่อบัญชี เลขที่บัญชี วันที่ เวลา รหัสผู้รับฝาก ยอดเงิน
    private String AccountName;
    private String AccountCode;
    private String TranDate;
    private String TranTime;
    private String EmpCode;
    private String Amount;
    private String DocNo;

}
