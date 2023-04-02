package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import th.co.cbank.util.MessageAlert;

public class DatabaseUtilController {

    private final Logger logger = Logger.getLogger(DatabaseUtilController.class);

    public List<String> showTables() {
        List<String> listStr = new ArrayList<>();
        String sql = "show tables";
        try (ResultSet rs = MySQLConnect.getResultSet(sql)) {
            while (rs.next()) {
                listStr.add(rs.getString(1));
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return listStr;
    }

    public void emptyTable(String tableName) {
        try {
            MySQLConnect.exeUpdate("truncate " + tableName);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }
}
