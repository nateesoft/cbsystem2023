package test.number;

public class TestNumber {
    
    public static void main(String[] args) {
//        double number = -1;
//        System.out.println(Math.abs(number));
        double digit = 1.1;
        double number = Math.ceil(digit);
        double number2 = digit/6 + 0.1*(digit%6);
        System.out.println(number);
        System.out.println(number2);
    }
}
