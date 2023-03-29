package test.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatTest {

    public static void main(String[] args) {
        SimpleDateFormat simp = new SimpleDateFormat("dd/MM/yy");
        String dateShow = simp.format(new Date());
        System.out.println(dateShow);
    }

}
