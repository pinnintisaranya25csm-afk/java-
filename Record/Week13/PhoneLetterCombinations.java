package records;


	import java.util.*;

	public class PhoneLetterCombinations {

	    static String[] keys = {
	        "", "", "abc", "def", "ghi", "jkl",
	        "mno", "pqrs", "tuv", "wxyz"
	    };

	    public static List<String> letterCombinations(String digits) {

	        List<String> result = new ArrayList<>();

	        if (digits.length() == 0) {
	            return result;
	        }

	        combine(digits, 0, "", result);

	        return result;
	    }

	    static void combine(String digits, int index,
	                        String current, List<String> result) {

	        if (index == digits.length()) {
	            result.add(current);
	            return;
	        }

	        int digit = digits.charAt(index) - '0';

	        if (digit < 2 || digit > 9) {
	            throw new IllegalArgumentException("Enter digits from 2 to 9");
	        }

	        String letters = keys[digit];

	        for (int i = 0; i < letters.length(); i++) {

	            combine(digits, index + 1,
	                    current + letters.charAt(i), result);
	        }
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter digits: ");
	        String digits = sc.nextLine();

	        System.out.println(letterCombinations(digits));

	        sc.close();
	    }
	}

