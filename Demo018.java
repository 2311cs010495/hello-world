public class Demo018 {

    public static void main(String[] args) {
        // Input: number of minutes
        long minutes = 525600; // Example: 525600 minutes (1 year)
        
        // Constants
        final int MINUTES_IN_HOUR = 60;
        final int HOURS_IN_DAY = 24;
        final int DAYS_IN_YEAR = 365;

        // Calculate total days
        long totalDays = minutes / (MINUTES_IN_HOUR * HOURS_IN_DAY);

        // Calculate years and remaining days
        long years = totalDays / DAYS_IN_YEAR;
        long remainingDays = totalDays % DAYS_IN_YEAR;

        // Output the result
        System.out.println(minutes + " minutes is approximately " + years + " years and " + remainingDays + " days.");
    }
}
