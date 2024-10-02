public class Main {

    public static void main(String[] args) {
            // Create a sample string
            String str = "Hello, Java Programming!"; 
            String str2 = "Hello, java programming!";
            // 1. length() returns the length of the string System.out.println("1. Length of the string: " + str.length());
            // 2. charAt() returns the character at a specific index System.out.println("2. Character at index 7: " + str.charAt(7));
            // 3. substring() returns a substring from the given string System.out.println("3. Substring from index 7 to 11: " + str.substring(7, 11));
            // 4. equals() compares two strings for equality System.out.println("4. Is str equal to str2?: " + str.equals(str2));
            // 5. equalsIgnoreCase() compares two strings, ignoring case
            System.out.println("5. Is str equal to str2 (ignore case)?: " + str.equalsIgnoreCase(str2));
            // 6. toUpperCase() converts string to uppercase System.out.println("6. Uppercase: " + str.toUpperCase());
            // 7. toLowerCase() converts string to lowercase System.out.println("7. Lowercase: " + str.toLowerCase());
            // 8. replace() replaces characters in the string
            System.out.println("8. Replace 'Java' with 'Python': " + str.replace("Java", "Python"));
            // 9. contains() checks if the string contains a sequence of characters System.out.println("9. Does the string contain 'Java'?: " + str.contains("Java"));
            // 10. indexOf() returns the index of the first occurrence of a character System.out.println("10. Index of first occurrence of 'a': " + str.indexOf('a'));
            // Bonus methods:
            // 11. concat() concatenates two strings
            System.out.println("11. Concatenate with ' Enjoy Coding!': " + str.concat(" Enjoy Coding!"));
            // 12. trim() removes leading and trailing spaces String strWithSpaces = " Lots of spaces ";
            System.out.println("12. After trim(): '" + str.trim() + "'");
            // 13. startsWith() checks if the string starts with a specific prefix System.out.println("13. Does the string start with 'Hello'?: " + str.startsWith("Hello"));
            // 14. endsWith() checks if the string ends with a specific suffix
            System.out.println("14. Does the string end with 'Programming!'?: " + str.endsWith("Programming!"));
            // 15. split() splits the string into an array
            String[] words = str.split(" ");
            System.out.println("15. Splitting the string by spaces:"); for (String word : words) {
            System.out.println(word); }
            } 
    }