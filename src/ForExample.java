public class ForExample {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= 5; i++) {
            for (int v = 1; v <= n - 1; ++v) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ((i - 1) * 2 + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
