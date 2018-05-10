public class CodingHours {
    public CodingHours() {
    }

    public static void main(String[] args) {
        int codeDailyHours = 6;
        int semesterDays = 85;
        int k = codeDailyHours * semesterDays;
        System.out.println(k + " hours spent an attendee with coding in a semester.");
        int codingHoursSemester = 510;

        int averageHoursWeekly = 52;
        double averageHoursSemester = 884;
        double percentageOfCoding = (double)codingHoursSemester / averageHoursSemester;
        System.out.println("percentage of coding hours is " + percentageOfCoding * 100);
    }
}