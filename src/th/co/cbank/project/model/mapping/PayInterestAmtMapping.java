package th.co.cbank.project.model.mapping;

import lombok.Data;

@Data
public class PayInterestAmtMapping {

    private int index;
    private String accountNo;
    private String accountName;
    private double balanceAmt;
    private double intAmt;
    private String custCode;

}
