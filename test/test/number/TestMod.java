package test.number;

public class TestMod {

    public static void main(String[] args) {
        int t_index = 25;
        int lineNo = 0;
        if (t_index <= 24) {
            lineNo = t_index;
        } else if (t_index > 24) {
            lineNo = t_index % 24;
        }
        System.out.println("lineNo=" + lineNo);
    }
    
    private int getLineNoToPrint(Integer lineNo, Integer t_index) {
        if (lineNo > 0) {
            return lineNo;
        }

        int line_no_set = 0;
        if (t_index <= 24) {
            line_no_set = t_index;
        } else if (t_index > 24) {
            line_no_set = t_index % 24;
        }

        return line_no_set;
    }
}
