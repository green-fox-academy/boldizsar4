public class SecondsADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int remainingS = (24 - currentHours) * 60 * 60 + (60 - currentMinutes) * 60 + (60-currentSeconds);
        System.out.println(remainingS);
    }
}
