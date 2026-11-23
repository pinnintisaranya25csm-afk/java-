package number;

import number.Roman;

public class RomanDemo {

    public static void main(String[] args) {

        String input = "LVIII";

        int result = Roman.romanToInteger(input);

        System.out.println("Roman numeral: " + input);
        System.out.println("Integer value: " + result);
    }
}
