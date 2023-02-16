import java.util.Random;

public class ArrayExp2 {
    public static void main(String[] args) {
        final int n = 10;
        Random r = new Random();
        int[] arr1 = new int[n];

        for (int i = 0; i < 100; i++) {
            arr1[r.nextInt(n)]++;
        }

        for (int x = 0; x < 100; x++) {
            System.out.printf("arr1[%d] = %d\n", x, arr1[x]);
        }
    }
}
