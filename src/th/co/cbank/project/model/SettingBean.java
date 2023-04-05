package th.co.cbank.project.model;

import lombok.Data;

@Data
public class SettingBean {

    private double INTEREST = 0.00;
    private double VAT = 0.00;
    private double BASE_DEPOSIT = 0.00;
    private double BASE_WITHDRAWAL = 0.00;
    private double INTEREST2 = 0.00;
    private double VAT2 = 0.00;
    private double BASE_DEPOSIT2 = 0.00;
    private double BASE_WITHDRAWAL2 = 0.00;
    private String UPDATE_DATE = "";
    private String PWD;
    private int DayCI = 0;

}
