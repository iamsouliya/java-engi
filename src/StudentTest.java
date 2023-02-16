public class StudentTest {
    public static void main(String[] args) {
        Student std = new Student(0, "Souliya", "Thammavong");
        std.setScore(100);
        std.setYear(new Day(2022).getYear());
        System.out.println(std.toString());
    }
}
