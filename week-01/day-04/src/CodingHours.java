public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
// work hours weekly is 52

        int codeDailyHours = 6;
        int semesterDays = (17 * 5);

        int k = codeDailyHours * semesterDays;
        System.out.println(k + " hours spent an attendee with coding in a semester.");

        int codingHoursSemester = 510;
        int averageHoursWeekly = 52;
        double averageHoursSemester = (52. * 17.);

        double percentageOfCoding = (codingHoursSemester / averageHoursSemester);


        System.out.println("percentage of coding hours is " + percentageOfCoding * 100);

    }

}
