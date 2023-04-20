package th.co.cbank.util;

public class PIDCheck {

    public static boolean checkPID(String id) {
        if (id.length() != 13) {
            return false;
        }

        int sum = 0;

        for (int i = 0; i < 12; i++) {
            sum += NumberFormat.toInt(String.valueOf(id.charAt(i))) * (13 - i);
        }

        return id.charAt(12) - '0' == ((11 - (sum % 11)) % 10);
    }
}
