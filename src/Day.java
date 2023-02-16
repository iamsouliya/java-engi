
public class Day {
    private int day;
    private int month;
    private int year;

    Day(int d, int m, int y) {
        this.day = d;
        this.month = m;
        this.year = y;
    }

    Day(int y) {
        this.year = y;
        this.month = 1;
        this.day = 1;
    }

    Day(int m, int y) {
        this.day = 1;
        this.month = m;
        this.year = y;
    }

    Day() {
        this.day = 2;
        this.month = 2;
        this.year = 2023;
    }

    public int setDay(int d) {
        return this.day = d;
    }

    public int setMonth(int m) {
        return this.month = m;
    }

    public int setYear(int y) {
        return this.day = y;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public int getBudhhaYear() {
        return this.year + 543;
    }

    public static int getBudhhaYear(int year) {
        return year + 543;
    }

    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}
