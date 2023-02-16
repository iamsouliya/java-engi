import java.util.Scanner;

public class ShowString {
    public static void main(String[] args) {
        try (Scanner stdInt = new Scanner(System.in)) {
            while (stdInt.hasNext()) {
                String s = stdInt.nextLine();
                System.out.println(s);
            }
            System.out.println("System Exit");
        }
    }
}
