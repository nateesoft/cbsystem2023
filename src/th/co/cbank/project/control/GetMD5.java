package th.co.cbank.project.control;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.apache.log4j.Logger;
import th.co.cbank.util.MessageAlert;

public class GetMD5 {

    private final Logger logger = Logger.getLogger(GetMD5.class);

    public boolean getMD5(String serialNo) {
        SimpleDateFormat simp = new SimpleDateFormat("dd/MM/yyyy HH EE", Locale.ENGLISH);
        String password = "softpos" + simp.format(new Date());
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());

            byte byteData[] = md.digest();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < byteData.length; i++) {
                sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
            }

            if (serialNo.equals(sb.toString())) {
                return true;
            }
        } catch (NoSuchAlgorithmException e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return false;
    }

    public String getMacAddress() {
        InetAddress ip;
        String MAC_ADDRESS = "";
        try {
            ip = InetAddress.getLocalHost();
            NetworkInterface network = NetworkInterface.getByInetAddress(ip);
            byte[] mac = network.getHardwareAddress();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < mac.length; i++) {
                sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
            }
            MAC_ADDRESS = sb.toString();
        } catch (SocketException | UnknownHostException e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        }

        return MAC_ADDRESS;
    }

    public String getSOC() {
        String soc = "";
        BufferedReader br = null;
        try {
            String sCurrentLine;
            br = new BufferedReader(new FileReader("soc.bin"));
            while ((sCurrentLine = br.readLine()) != null) {
                soc += sCurrentLine;
            }

        } catch (IOException e) {
            logger.error(e.getMessage());
            MessageAlert.errorPopup(this.getClass(), e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                MessageAlert.errorPopup(this.getClass(), ex.getMessage());
            }
        }

        return soc.trim();
    }

}
