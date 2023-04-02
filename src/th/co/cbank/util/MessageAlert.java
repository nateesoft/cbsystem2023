package th.co.cbank.util;

import java.awt.Component;
import javax.swing.JOptionPane;

public class MessageAlert {

    public static int YES_OPTION = JOptionPane.YES_OPTION;

    public static void infoPopup(Class clazz, String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public static void infoPopup(Component parentComponent, String message) {
        JOptionPane.showMessageDialog(parentComponent, message);
    }

    public static void warningPopup(Class clazz, String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public static void warningPopup(Component parentComponent, String message) {
        JOptionPane.showMessageDialog(parentComponent, message);
    }

    public static void errorPopup(Class clazz, String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public static void errorPopup(Component parentComponent, String message) {
        JOptionPane.showMessageDialog(parentComponent, message);
    }

    public static int showConfirm(Component parentComponent, String title) {
        return JOptionPane.showConfirmDialog(parentComponent, title);
    }
}
