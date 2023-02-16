public class Student {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int score;
    private int year;

    Student(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public void setId(int studentId) {
        this.id = studentId;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setName(String studentName) {
        this.name = studentName;
    }

    public void setSurname(String studentSurname) {
        this.surname = studentSurname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getId() {
        return this.id;
    }

    public int getYear() {
        return this.year;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getEmail() {
        return this.email;
    }

    public int getScore() {
        return this.score;
    }

    public String toString() {
        return String.format("%s %04d", name, year);
    }
}