package th.co.cbank.project.control;

import org.apache.log4j.Logger;
import th.co.cbank.util.MessageAlert;

public class BaseControl {

    private final Logger logger = Logger.getLogger(BaseControl.class);

    public int update(String sql) {
        try {
            return MySQLConnect.exeUpdate(sql);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return -1;
    }

}
