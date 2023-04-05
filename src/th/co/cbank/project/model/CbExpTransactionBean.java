package th.co.cbank.project.model;

import java.util.Date;
import lombok.Data;

@Data
public class CbExpTransactionBean {

    private String EXP_DOC;
    private Date EXP_DATE;
    private String BRANCH_CODE;
    private String EMP_CODE;
    private String EXP_TYPE;
    private double EMP_AMOUNT = 0.00;

}
