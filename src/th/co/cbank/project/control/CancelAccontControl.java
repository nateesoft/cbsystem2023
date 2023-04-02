package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import th.co.cbank.util.DateFormat;
import th.co.cbank.util.MessageAlert;
import th.co.cbank.util.ThaiUtil;

public class CancelAccontControl {

    private final Logger logger = Logger.getLogger(CancelAccontControl.class);

    public List<Object[]> getAccountToCancel() {
        List<Object[]> list = new ArrayList();
        try {
            String sql = "select b_cust_code,b_cust_name,"
                    + "b_cust_lastname,account_code,account_type, TypeName,b_start,book_no "
                    + "from cb_save_account s, cb_save_config c "
                    + "where s.account_type=c.typecode "
                    + "and b_start=curdate() "
                    + "and b_balance=0 ";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            while (rs.next()) {
                list.add(new Object[]{
                    rs.getString("b_cust_code"),
                    ThaiUtil.ASCII2Unicode(rs.getString("b_cust_name") + " " + rs.getString("b_cust_lastname")),
                    rs.getString("account_code"),
                    ThaiUtil.ASCII2Unicode(rs.getString("TypeName")),
                    DateFormat.getLocale_ddMMyyyy(rs.getDate("b_start")),
                    rs.getString("account_type"),
                    rs.getString("book_no")
                });
            }

            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return list;
    }
}
