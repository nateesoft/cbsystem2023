package th.co.cbank.util;

import java.text.DecimalFormat;

public class NumberFormat {

    static DecimalFormat dec0 = new DecimalFormat("#,##0");
    static DecimalFormat dec1 = new DecimalFormat("#,##0.00");
    static DecimalFormat dec3 = new DecimalFormat("#,##0.000");
    static DecimalFormat dec4 = new DecimalFormat("#,##0.0000");
    static DecimalFormat dec5 = new DecimalFormat("#,##0.00000");

    public static String showCommaOnly(float obj) {
        return dec0.format(obj);
    }

    public static String showCommaOnly(int obj) {
        return dec0.format(obj);
    }

    public static String showDouble2(float obj) {
        return dec1.format(obj);
    }

    public static String showDouble2(double obj) {
        return dec1.format(obj);
    }

    public static String showDouble2ToCeil(double obj) {
        return dec1.format(Math.ceil(obj));
    }

    public static String showDouble2(String str) {
        try {
            Double d = NumberFormat.toDouble(str);
            return dec1.format(d);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return "0.00";
        }
    }

    public static String showDouble3(float obj) {
        return dec3.format(obj);
    }

    public static String showDouble3(double obj) {
        return dec3.format(obj);
    }

    public static String showDouble3(String str) {
        try {
            Double d = NumberFormat.toDouble(str);
            return dec3.format(d);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return "0.000";
        }
    }

    public static String showDouble4(float obj) {
        return dec4.format(obj);
    }

    public static String showDouble4(double obj) {
        return dec4.format(obj);
    }

    public static String showDouble4(String str) {
        try {
            Double d = NumberFormat.toDouble(str);
            return dec4.format(d);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return "0.00";
        }
    }

    public static String showDouble5(float obj) {
        return dec5.format(obj);
    }

    public static String showDouble5(double obj) {
        return dec5.format(obj);
    }

    public static String showDouble5(String str) {
        try {
            Double d = NumberFormat.toDouble(str);
            return dec5.format(d);
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
            return "0.00";
        }
    }

    public static Double toDouble(String str) {
        if (StringUtil.isEmpty(str)) {
            return null;
        }
        try {
            return Double.parseDouble(str.replace(",", ""));
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    public static Integer toInt(String str) {
        if (StringUtil.isEmpty(str)) {
            return null;
        }
        try {
            return Integer.parseInt(str.replace(",", ""));
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    public static String toNumberFormat(Object obj) {
        DecimalFormat dec = new DecimalFormat("#,#00.00");
        return dec.format(obj);
    }

}
