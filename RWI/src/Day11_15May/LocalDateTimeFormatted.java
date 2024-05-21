//Local Date & Time o9
package Day11_15May;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeFormatted {
    public static void main(String[] args) {
        // Get the current local date and time
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Define a formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Format the date-time
        String formattedDateTime = currentDateTime.format(formatter);

        System.out.println("Formatted Current Date and Time: " + formattedDateTime);
    }
}
