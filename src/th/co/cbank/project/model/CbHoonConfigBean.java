package th.co.cbank.project.model;

import lombok.Data;

@Data
public class CbHoonConfigBean {

    private String hoonCode;
    private String hoonName;
    private double hoonRate = 0.00;
    private int hoonVolumnMax = 9999999;
    private double hoonDeviden = 0.00;
    private int hoonBuyMin = 0;

}
