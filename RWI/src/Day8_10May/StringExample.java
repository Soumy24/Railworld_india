package Day8_10May;

public class StringExample {
    public static void main(String[] args) {
        // Creating Strings
        String str1 = "Hello, World!";
        String str2 = new String("Java Programming");

        // Displaying the Strings
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        // Getting the length of the Strings
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Length of str2: " + str2.length());

        // Concatenation of Strings
        String str3 = str1 + " " + str2;
        System.out.println("Concatenated String: " + str3);

        // Substring
        String substring = str1.substring(7, 12); // "World"
        System.out.println("Substring of str1: " + substring);

        // Character at a specific index
        char charAt = str1.charAt(4); // 'o'
        System.out.println("Character at index 4 in str1: " + charAt);

        // Checking if a String contains a substring
        boolean contains = str2.contains("Java");
        System.out.println("str2 contains 'Java': " + contains);

        // Replacing characters in a String
        String replacedString = str1.replace('o', 'a');
        System.out.println("Replaced String: " + replacedString);

        // Converting to uppercase and lowercase
        String upperStr = str1.toUpperCase();
        String lowerStr = str1.toLowerCase();
        System.out.println("Uppercase str1: " + upperStr);
        System.out.println("Lowercase str1: " + lowerStr);

        // Splitting a String
        String[] words = str1.split(" ");
        System.out.println("Words in str1:");
        for (String word : words) {
            System.out.println(word);
        }

        // Trimming whitespace from the beginning and end
        String str4 = "   Trim me!   ";
        System.out.println("Original str4: '" + str4 + "'");
        String trimmedStr = str4.trim();
        System.out.println("Trimmed str4: '" + trimmedStr + "'");
    }
}
