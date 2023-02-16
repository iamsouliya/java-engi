public class InitArray2 {
    public static void main(String[] args) {
        int a[];
        a = new int[] { 1, 2, 3, 4, 5, 6 };
        // for (int i = 0; i < a.length; i++) {
        // System.out.println(a[i]);
        // }

        for (int i : a) {
            System.out.println(i);
        }
    }
}
