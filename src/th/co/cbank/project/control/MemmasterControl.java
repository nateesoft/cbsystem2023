package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import th.co.cbank.project.model.Memmaster;
import th.co.cbank.util.MessageAlert;

public class MemmasterControl extends BaseControl {

    private final Logger logger = Logger.getLogger(MemmasterControl.class);

    public List<Memmaster> getListMemberTotalScore(String memberCode) {
        List<Memmaster> listBean = new ArrayList<>();
        try {
            String sql = "select Member_TotalScore "
                    + "from " + MySQLConnect.DATABASE_MEMBER + ".memmaster "
                    + "where Member_Code='" + memberCode + "';";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            while (rs.next()) {
                Memmaster bean = new Memmaster();

                listBean.add(bean);
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return new ArrayList();
        }

        return listBean;
    }
}
