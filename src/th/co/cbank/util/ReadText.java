package th.co.cbank.util;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadText {

    public static String readTextToString(String f) {
        String content = null;
        File file = new File(f);
        try {
            FileReader reader = new FileReader(file);
            char[] chars = new char[(int) file.length()];
            reader.read(chars);
            content = new String(chars);
            reader.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        if (content != null) {
            return content;
        }

        return "              :) ยินดีต้อนรับทุกท่านเข้าสู่ระบบ :)";
    }
}
