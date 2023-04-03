package th.co.cbank.project.model;

import java.util.Date;
import lombok.Data;

@Data
public class PointtypeBean {

    private String Point_TypeCode;
    private String Point_TypeName;
    private String Point_TypeDateService;
    private Date Point_StartDateService;
    private Date Point_FinishDateService;
    private String Point_StartTimeService1 = "00:00:00";
    private String Point_FinishTimeService1 = "00:00:00";
    private double BahtRatePerPoint1 = 0;
    private double Point1 = 0;
    private String Point_StartTimeService2 = "00:00:00";
    private String Point_FinishTimeService2 = "00:00:00";
    private double BahtRatePerPoint2 = 0;
    private double Point2 = 0;
    private String Point_StartTimeService3 = "00:00:00";
    private String Point_FinishTimeService3 = "00:00:00";
    private double BahtRatePerPoint3 = 0;
    private double Point3 = 0;

}
