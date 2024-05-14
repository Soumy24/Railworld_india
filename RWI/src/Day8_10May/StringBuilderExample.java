package Day8_10May;


public class StringBuilderExample {
    public static void main(String[] args) {
        // Creating a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // Displaying the initial content
        System.out.println("Initial StringBuilder: " + sb);

        // Appending text to the StringBuilder
        sb.append(", World!");
        System.out.println("After append: " + sb);

        // Inserting text at a specific position
        sb.insert(5, " Java");
        System.out.println("After insertion: " + sb);

        // Replacing text within the StringBuilder
        sb.replace(6, 10, "Wonderful");
        System.out.println("After replace: " + sb);

        // Deleting text from the StringBuilder
        sb.delete(6, 15);
        System.out.println("After delete: " + sb);

        // Reversing the content of the StringBuilder
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Converting StringBuilder to a String
        String result = sb.toString();
        System.out.println("Final string: " + result);
    }
}
