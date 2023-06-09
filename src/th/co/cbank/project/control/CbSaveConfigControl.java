package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.log4j.Logger;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.model.CbSaveConfigBean;
import th.co.cbank.util.DateFormat;
import th.co.cbank.util.MessageAlert;

public class CbSaveConfigControl extends BaseControl {

    private final Logger logger = Logger.getLogger(CbSaveConfigControl.class);

    public List<CbSaveConfigBean> listSaveConfig() {
        List<CbSaveConfigBean> listBean = new ArrayList<>();
        try {
            String sql = "select * from cb_save_config";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            while (rs.next()) {
                CbSaveConfigBean bean = new CbSaveConfigBean();
                bean.setTypeCode(rs.getString("TypeCode"));
                bean.setTypeName(ThaiUtil.ASCII2Unicode(rs.getString("TypeName")));
                bean.setTypeINT(rs.getDouble("TypeINT"));
                bean.setTypeCondition(rs.getString("TypeCondition"));
                bean.setRDType2(rs.getDouble("RDType2"));
                bean.setCbRDType2(rs.getInt("CbRDType2"));
                bean.setRdTypeDialy(rs.getString("RdTypeDialy"));
                bean.setPayType(rs.getString("PayType"));
                bean.setCbPayType1(rs.getInt("CbPayType1"));
                bean.setCbPayType2(rs.getInt("CbPayType2"));
                bean.setCbPayType3(rs.getInt("CbPayType3"));
                bean.setCbPayType4(rs.getInt("CbPayType4"));
                bean.setCbPayType5(rs.getInt("CbPayType5"));
                bean.setCbPayType6(rs.getInt("CbPayType6"));
                bean.setCbPayType7(rs.getInt("CbPayType7"));
                bean.setPayINT(rs.getDouble("PayINT"));
                bean.setFundINT(rs.getDouble("FundINT"));
                bean.setMaxDeposit(rs.getDouble("max_deposit"));
                bean.setTAX(rs.getDouble("TAX"));
                bean.setSaveRunning(rs.getInt("SaveRunning"));
                bean.setNoRunning(rs.getInt("NoRunning"));
                bean.setSaveFee(rs.getDouble("SaveFee"));
                bean.setMinDeposit(rs.getDouble("min_deposit"));
                bean.setMinWitdraw(rs.getDouble("min_withdraw"));
                bean.setCreate_date(rs.getString("create_date"));
                bean.setUpdate_date(rs.getString("update_date"));

                listBean.add(bean);
            }
            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return listBean;
    }

    public List<CbSaveConfigBean> listSaveConfigHistory() {
        List<CbSaveConfigBean> listBean = new ArrayList<>();
        try {
            String sql = "select * from cb_save_config_history order by create_date, update_date";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            while (rs.next()) {
                CbSaveConfigBean bean = new CbSaveConfigBean();
                bean.setTypeCode(rs.getString("TypeCode"));
                bean.setTypeName(ThaiUtil.ASCII2Unicode(rs.getString("TypeName")));
                bean.setTypeINT(rs.getDouble("TypeINT"));
                bean.setTypeCondition(rs.getString("TypeCondition"));
                bean.setRDType2(rs.getDouble("RDType2"));
                bean.setCbRDType2(rs.getInt("CbRDType2"));
                bean.setRdTypeDialy(rs.getString("RdTypeDialy"));
                bean.setPayType(rs.getString("PayType"));
                bean.setCbPayType1(rs.getInt("CbPayType1"));
                bean.setCbPayType2(rs.getInt("CbPayType2"));
                bean.setCbPayType3(rs.getInt("CbPayType3"));
                bean.setCbPayType4(rs.getInt("CbPayType4"));
                bean.setCbPayType5(rs.getInt("CbPayType5"));
                bean.setCbPayType6(rs.getInt("CbPayType6"));
                bean.setCbPayType7(rs.getInt("CbPayType7"));
                bean.setPayINT(rs.getDouble("PayINT"));
                bean.setFundINT(rs.getDouble("FundINT"));
                bean.setMaxDeposit(rs.getDouble("max_deposit"));
                bean.setTAX(rs.getDouble("TAX"));
                bean.setSaveRunning(rs.getInt("SaveRunning"));
                bean.setNoRunning(rs.getInt("NoRunning"));
                bean.setSaveFee(rs.getDouble("SaveFee"));
                bean.setMinDeposit(rs.getDouble("min_deposit"));
                bean.setMinWitdraw(rs.getDouble("min_withdraw"));
                bean.setCreate_date(rs.getString("create_date"));
                bean.setUpdate_date(rs.getString("update_date"));

                listBean.add(bean);
            }
            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return listBean;
    }

    public List<CbSaveConfigBean> listSaveConfigHistory(String accountType) {
        List<CbSaveConfigBean> listBean = new ArrayList<>();
        try {
            String sql = "select * from cb_save_config_history "
                    + "where TypeCode='" + accountType + "' order by create_date, update_date";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            while (rs.next()) {
                CbSaveConfigBean bean = new CbSaveConfigBean();
                bean.setTypeCode(rs.getString("TypeCode"));
                bean.setTypeName(ThaiUtil.ASCII2Unicode(rs.getString("TypeName")));
                bean.setTypeINT(rs.getDouble("TypeINT"));
                bean.setTypeCondition(rs.getString("TypeCondition"));
                bean.setRDType2(rs.getDouble("RDType2"));
                bean.setCbRDType2(rs.getInt("CbRDType2"));
                bean.setRdTypeDialy(rs.getString("RdTypeDialy"));
                bean.setPayType(rs.getString("PayType"));
                bean.setCbPayType1(rs.getInt("CbPayType1"));
                bean.setCbPayType2(rs.getInt("CbPayType2"));
                bean.setCbPayType3(rs.getInt("CbPayType3"));
                bean.setCbPayType4(rs.getInt("CbPayType4"));
                bean.setCbPayType5(rs.getInt("CbPayType5"));
                bean.setCbPayType6(rs.getInt("CbPayType6"));
                bean.setCbPayType7(rs.getInt("CbPayType7"));
                bean.setPayINT(rs.getDouble("PayINT"));
                bean.setFundINT(rs.getDouble("FundINT"));
                bean.setMaxDeposit(rs.getDouble("max_deposit"));
                bean.setTAX(rs.getDouble("TAX"));
                bean.setSaveRunning(rs.getInt("SaveRunning"));
                bean.setNoRunning(rs.getInt("NoRunning"));
                bean.setSaveFee(rs.getDouble("SaveFee"));
                bean.setMinDeposit(rs.getDouble("min_deposit"));
                bean.setMinWitdraw(rs.getDouble("min_withdraw"));
                bean.setCreate_date(rs.getString("create_date"));
                bean.setUpdate_date(rs.getString("update_date"));

                listBean.add(bean);
            }
            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return listBean;
    }

    public CbSaveConfigBean findOneByTypeCode(String typeCode) {
        CbSaveConfigBean bean = new CbSaveConfigBean();
        try {
            String sql = "select * from cb_save_config where TypeCode='" + typeCode + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                bean.setTypeCode(rs.getString("TypeCode"));
                bean.setTypeName(ThaiUtil.ASCII2Unicode(rs.getString("TypeName")));
                bean.setTypeINT(rs.getDouble("TypeINT"));
                bean.setTypeCondition(rs.getString("TypeCondition"));
                bean.setRDType2(rs.getDouble("RDType2"));
                bean.setCbRDType2(rs.getInt("CbRDType2"));
                bean.setRdTypeDialy(rs.getString("RdTypeDialy"));
                bean.setPayType(rs.getString("PayType"));
                bean.setCbPayType1(rs.getInt("CbPayType1"));
                bean.setCbPayType2(rs.getInt("CbPayType2"));
                bean.setCbPayType3(rs.getInt("CbPayType3"));
                bean.setCbPayType4(rs.getInt("CbPayType4"));
                bean.setCbPayType5(rs.getInt("CbPayType5"));
                bean.setCbPayType6(rs.getInt("CbPayType6"));
                bean.setCbPayType7(rs.getInt("CbPayType7"));
                bean.setPayINT(rs.getDouble("PayINT"));
                bean.setFundINT(rs.getDouble("FundINT"));
                bean.setMaxDeposit(rs.getDouble("max_deposit"));
                bean.setTAX(rs.getDouble("TAX"));
                bean.setSaveRunning(rs.getInt("SaveRunning"));
                bean.setNoRunning(rs.getInt("NoRunning"));
                bean.setSaveFee(rs.getDouble("SaveFee"));

                bean.setMinDeposit(rs.getDouble("min_deposit"));
                bean.setMinWitdraw(rs.getDouble("min_withdraw"));
            } else {
                bean = null;
            }
            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return bean;
    }

    public boolean typeCodeExist(String TypeCode) {
        boolean isExists = false;
        try {
            String sql = "select TypeCode from cb_save_config where TypeCode='" + TypeCode + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                isExists = true;
            }
            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return isExists;
    }

    public boolean saveCbSaveConfig(CbSaveConfigBean bean) {
        try {
            String sql = "insert into cb_save_config "
                    + "(TypeCode,TypeName,TypeINT,TypeCondition,RDType2,cbRDType2,rdTypeDialy,payType,cbPayType1,"
                    + "cbPayType2,cbPayType3,cbPayType4,cbPayType5,cbPayType6,cbPayType7,"
                    + "PayINT,FundINT,max_deposit,TAX,SaveRunning,NoRunning, SaveFee, min_deposit, min_withdraw,"
                    + "create_date,update_date)  "
                    + "values('" + bean.getTypeCode() + "','" + ThaiUtil.Unicode2ASCII(bean.getTypeName()) + "','" + bean.getTypeINT() + "',"
                    + "'" + bean.getTypeCondition() + "','" + bean.getRDType2() + "','" + bean.getCbRDType2() + "',"
                    + "'" + bean.getRdTypeDialy() + "','" + bean.getPayType() + "','" + bean.getCbPayType1() + "',"
                    + "'" + bean.getCbPayType2() + "','" + bean.getCbPayType3() + "','" + bean.getCbPayType4() + "',"
                    + "'" + bean.getCbPayType5() + "','" + bean.getCbPayType6() + "','" + bean.getCbPayType7() + "',"
                    + "'" + bean.getPayINT() + "','" + bean.getFundINT() + "','" + bean.getMaxDeposit() + "',"
                    + "'" + bean.getTAX() + "','" + bean.getSaveRunning() + "','" + bean.getNoRunning() + "',"
                    + "'" + bean.getSaveFee() + "','" + bean.getMinDeposit() + "','" + bean.getMinWitdraw() + "',"
                    + "now(), now())";
            String sqlChk = "select * from cb_save_config where TypeCode='" + bean.getTypeCode() + "' ";
            ResultSet rs = MySQLConnect.getResultSet(sqlChk);
            if (rs.next()) {
                updateCbSaveConfig(bean);
            } else {
                update(sql);
            }

            // save history
            String sqlHistory = "insert into cb_save_config_history "
                    + "select * from cb_save_config where typecode='" + bean.getTypeCode() + "'";
            int result = MySQLConnect.exeUpdate(sqlHistory);
            logger.info("result: " + result);

            rs.close();
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return false;
    }

    public boolean updateCbSaveConfig(CbSaveConfigBean bean) {
        try {
            String sql = "update cb_save_config set "
                    + "TypeCode='" + bean.getTypeCode() + "', "
                    + "TypeName='" + ThaiUtil.Unicode2ASCII(bean.getTypeName()) + "', TypeINT='" + bean.getTypeINT() + "', "
                    + "TypeCondition='" + bean.getTypeCondition() + "', RDType2='" + bean.getRDType2() + "', "
                    + "cbRDType2='" + bean.getCbRDType2() + "', rdTypeDialy='" + bean.getRdTypeDialy() + "', "
                    + "payType='" + bean.getPayType() + "', cbPayType1='" + bean.getCbPayType1() + "', "
                    + "cbPayType2='" + bean.getCbPayType2() + "', cbPayType3='" + bean.getCbPayType3() + "', "
                    + "cbPayType4='" + bean.getCbPayType4() + "', cbPayType5='" + bean.getCbPayType5() + "', "
                    + "cbPayType6='" + bean.getCbPayType6() + "', cbPayType7='" + bean.getCbPayType7() + "', "
                    + "PayINT='" + bean.getPayINT() + "',"
                    + "FundINT='" + bean.getFundINT() + "',"
                    + "max_deposit='" + bean.getMaxDeposit() + "',"
                    + "min_deposit='" + bean.getMinDeposit() + "',"
                    + "min_withdraw='" + bean.getMinWitdraw() + "',"
                    + "TAX='" + bean.getTAX() + "',"
                    + "SaveRunning='" + bean.getSaveRunning() + "',"
                    + "NoRunning='" + bean.getNoRunning() + "',"
                    + "SaveFee='" + bean.getSaveFee() + "', "
                    + "update_date=now() "
                    + "where TypeCode='" + bean.getTypeCode() + "'";
            update(sql);
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return false;
    }

    public int getMaxInt(String saveAccType) {
        int MaxNO = 1;
        try {
            String sql = "select max(NoRunning) MAX_NO "
                    + "from cb_save_config where TypeCode='" + saveAccType + "';";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                MaxNO = rs.getInt("MAX_NO");
                if (MaxNO == 0) {
                    String sqlUpd = "update cb_save_config set NoRunning='1' where TypeCode='" + saveAccType + "'";
                    update(sqlUpd);
                }
            }

            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        if (MaxNO == 0) {
            MaxNO = 1;
        }

        return MaxNO;
    }

    public void updateMaxInt(String saveAccType) {
        try {
            String sql = "update cb_save_config set "
                    + "NoRunning=NoRunning+1 where TypeCode='" + saveAccType + "'";
            update(sql);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }
    }

    public boolean deleteConfig(String SaveDocType) {
        try {
            String sql = "delete from cb_save_config where TypeCode='" + SaveDocType + "'";
            update(sql);
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return false;
        }
    }

    public boolean updateSaveRunningAndNoRunning(String accountType) {
        try {
            String sql1 = "update cb_save_config set "
                    + "SaveRunning=SaveRunning-1, "
                    + "NoRunning=NoRunning-1 "
                    + "where typeCode='" + accountType + "'";
            MySQLConnect.exeUpdate(sql1);
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
            return false;
        }
        return true;
    }

    public CbSaveConfigBean findOneByUpdateDateTypeCode(Date dateCheck, String typeCode) {
        CbSaveConfigBean bean = new CbSaveConfigBean();
        try {
            String sql = "select * from cb_save_config_history where typecode='" + typeCode + "' "
                    + "and update_date <= '" + DateFormat.getMySQL_DateTime(dateCheck) + "' "
                    + "order by update_date desc limit 1;";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                bean.setTypeCode(rs.getString("TypeCode"));
                bean.setTypeName(ThaiUtil.ASCII2Unicode(rs.getString("TypeName")));
                bean.setTypeINT(rs.getDouble("TypeINT"));
                bean.setTypeCondition(rs.getString("TypeCondition"));
                bean.setRDType2(rs.getDouble("RDType2"));
                bean.setCbRDType2(rs.getInt("CbRDType2"));
                bean.setRdTypeDialy(rs.getString("RdTypeDialy"));
                bean.setPayType(rs.getString("PayType"));
                bean.setCbPayType1(rs.getInt("CbPayType1"));
                bean.setCbPayType2(rs.getInt("CbPayType2"));
                bean.setCbPayType3(rs.getInt("CbPayType3"));
                bean.setCbPayType4(rs.getInt("CbPayType4"));
                bean.setCbPayType5(rs.getInt("CbPayType5"));
                bean.setCbPayType6(rs.getInt("CbPayType6"));
                bean.setCbPayType7(rs.getInt("CbPayType7"));
                bean.setPayINT(rs.getDouble("PayINT"));
                bean.setFundINT(rs.getDouble("FundINT"));
                bean.setMaxDeposit(rs.getDouble("max_deposit"));
                bean.setTAX(rs.getDouble("TAX"));
                bean.setSaveRunning(rs.getInt("SaveRunning"));
                bean.setNoRunning(rs.getInt("NoRunning"));
                bean.setSaveFee(rs.getDouble("SaveFee"));

                bean.setMinDeposit(rs.getDouble("min_deposit"));
                bean.setMinWitdraw(rs.getDouble("min_withdraw"));
            } else {
                bean = null;
            }
            rs.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return bean;
    }

}
