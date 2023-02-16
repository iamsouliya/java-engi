public class TestDay {
    public static String print(Day day) {
        return String.format("%02d/%02d/%04d", day.getDay(), day.getMonth(), day.getYear());
    }

    public static void main(String[] args) {
        // Day d1 = new Day();
        // Day d2 = new Day(2023);
        // Day d3 = new Day(2, 2023);
        Day d4 = new Day(2, 2, 2023);
        // System.out.println("day1 = " + print(d1));
        // System.out.println("buddhaYear = " + d2.getBudhhaYear());
        // System.out.println("day3 = " + print(d3));
        // System.out.println("day4 = " + print(d4));
        // System.out.println("Day Class = " + Day.getBudhhaYear(d2.getYear()));
        System.out.println("Day = " + d4.toString());
    }
}
