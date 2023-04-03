package th.co.cbank.project.model;

import java.util.Date;
import lombok.Data;

@Data
public class CbFeeTransactionBean {

    private String fee_code = "";
    private String fee_desc = "";
    private double fee_amount = 0.00;
    private String fee_branch = "";
    private String fee_emp_code = "";
    private String fee_cust_code = "";
    private Date fee_date = null;
    private String fee_time = "";

}
