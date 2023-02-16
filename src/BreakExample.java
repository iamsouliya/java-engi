import java.util.Scanner;

public class BreakExample {
    public static void main(String[] args) {
        try (Scanner stdIn = new Scanner(System.in)) {
            while (true) {
                int n = stdIn.nextInt();
                if (n == 0) {
                    break;
                }
                System.out.print("i = " + n);
            }
            System.out.println("Program has exit");
        }
    }
}
