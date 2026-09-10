package exceptions;

public class Stringoperations {
    public static void main(String[] args) {

        String str1 = "Hello Java";

        // 1. length()
        System.out.println("Length: " + str1.length());

        // 2. charAt()
        System.out.println("Character at index 1: " + str1.charAt(1));

        // 3. toUpperCase()
        System.out.println("Uppercase: " + str1.toUpperCase());

        // 4. toLowerCase()
        System.out.println("Lowercase: " + str1.toLowerCase());

        // 5. substring()
        System.out.println("Substring: " + str1.substring(6));

        // 6. concat()
        System.out.println("Concatenation: " + str1.concat(" Programming"));

        // 7. equals()
        String str2 = "Hello World";
        System.out.println("Equals: " + str1.equals(str2));

        // 8. equalsIgnoreCase()
        System.out.println("Equals Ignore Case: " +str1.equalsIgnoreCase("hello java"));
                           ;

        // 9. contains()
        System.out.println("Contains Java: " + str1.contains("Java"));

        // 10. startsWith()
        System.out.println("Starts with He: " + str1.startsWith("He"));

        // 11. endsWith()
        System.out.println("Ends with Java: " + str1.endsWith("Java"));

        // 12. indexOf()
        System.out.println("Index of J: " + str1.indexOf('J'));

        // 13. replace()
        System.out.println("Replace: " + str1.replace("Java", "Teerak"));

        // 14. trim()
        String str3 = "   Swade Krub  ";
        System.out.println("Trimmed: " + str3.trim());

        // 15. isEmpty()
        
        System.out.println("Is Empty: " + str1.isEmpty());
    }
}
   