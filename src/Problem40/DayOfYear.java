package Problem40;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

    public class DayOfYear {
        public static void main(String[] args) {
            String dateStr = "2024-12-01"; // Example date string in YYYY-MM-DD format
            int dayOfYear = getDayOfYear(dateStr);
            System.out.println("The day number of the year for " + dateStr + " is: " + dayOfYear);
        }

        public static int getDayOfYear(String dateStr) {
            // Define the date format
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            // Parse the date string to a LocalDate object
            LocalDate date = LocalDate.parse(dateStr, formatter);
            // Get the day of the year
            return date.getDayOfYear();
        }
    }


