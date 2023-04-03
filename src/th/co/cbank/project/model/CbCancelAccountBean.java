package th.co.cbank.project.model;

import java.util.Date;
import lombok.Data;

@Data
public class CbCancelAccountBean {

    private Date date_cancel;
    private String time_cancel = "00:00:00";
    private String account_no;
    private String account_type;
    private String user_code;

}
