package th.co.cbank.project.control;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import org.apache.log4j.Logger;
import th.co.cbank.util.MessageAlert;

public class MySQLConnect {

    private static final Logger logger = Logger.getLogger(MySQLConnect.class);
    private static String CLASS_NAME;
    public static String SERVER;
    public static boolean USE_FINGER = false;
    private static String USER;
    private static String PASS;
    public static String DATABASE;
    public static String DATABASE_MEMBER;
    public static Connection conn;
    private static int PORT;
    private static String CHARSET;

    public static Connection connect() {
        CLASS_NAME = "com.mysql.jdbc.Driver";
        try {
            Properties prop = new Properties();
            InputStream input = new FileInputStream("itfinger_conf.txt");
            prop.load(input);

            SERVER = prop.getProperty("server");
            DATABASE = prop.getProperty("database");
            DATABASE_MEMBER = prop.getProperty("database_member");
            if (DATABASE_MEMBER == null || DATABASE_MEMBER.equals("")) {
                DATABASE_MEMBER = "";
            }
            USER = prop.getProperty("username");
            PASS = prop.getProperty("password");
            PORT = Integer.parseInt(prop.getProperty("port"));
            CHARSET = prop.getProperty("charset");
            String uUSE_FINGER = prop.getProperty("use_finger");
            if (uUSE_FINGER != null) {
                USE_FINGER = uUSE_FINGER.equalsIgnoreCase("Y");
            }
            Value.PATH_SCAN = prop.getProperty("pathscan");
            Value.PATH_EXE = prop.getProperty("pathexe");
            Value.MACNO = prop.getProperty("macno");
            if (Value.PATH_SCAN == null) {
                //MessageAlert.infoPopup(this.getClass(), "กรุณาตั้งค่าระบบ Path สำหรับ Scan ลายนิ้วมือก่อนใช้งานโปรแกรม");
                //System.exit(0);
            }
            if (Value.PATH_EXE == null) {
                //MessageAlert.infoPopup(this.getClass(), "กรุณาตั้งค่าระบบ Path โปรแกรมสำหรับ Scan ลายนิ้วมือก่อนใช้งานโปรแกรม");
                //System.exit(0);
            }
            input.close();
        } catch (IOException e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(MySQLConnect.class, e.getMessage());
        }

        try {
            Class.forName(CLASS_NAME);
            String jdbcUrl = "jdbc:mysql://" + SERVER + ":" + PORT + "/" + DATABASE + "?charset=" + CHARSET;
            conn = DriverManager.getConnection(jdbcUrl, USER, PASS);
        } catch (ClassNotFoundException | SQLException e) {
            MessageAlert.errorPopup(MySQLConnect.class, e.getMessage());
            if (SERVER == null) {
                System.exit(0);
            }
        }

        return conn;
    }

    public static Statement getStatement() throws Exception {
        if (conn == null) {
            connect();
            return conn.createStatement();
        } else {
            return conn.createStatement();
        }
    }

    public static ResultSet getResultSet(String sql) throws Exception {
        if (conn == null) {
            connect();
            return getStatement().executeQuery(sql);
        } else {
            return getStatement().executeQuery(sql);
        }
    }

    public static int exeUpdate(String sql) throws Exception {
        if (conn == null) {
            connect();
            return conn.createStatement().executeUpdate(sql);
        } else {
            return conn.createStatement().executeUpdate(sql);
        }
    }

    public static void close() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(MySQLConnect.class, e.getMessage());
        }
    }
}
