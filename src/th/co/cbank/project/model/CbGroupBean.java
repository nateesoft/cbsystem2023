package th.co.cbank.project.model;

import org.apache.log4j.Logger;

public class CbGroupBean {
    private final Logger logger = Logger.getLogger(CbGroupBean.class);
    private String groupcode;
    private String groupname;
    private String permission;

    public String getGroupcode() {
        return groupcode;
    }

    public void setGroupcode(String groupcode) {
        this.groupcode = groupcode;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

}
