public class PowerExp {
    // method with arguments
    static int power(int x, int y) {
        int n = 1;
        while (y-- > 0) {
            n *= x;
        }
        return n;
    };

    // void method
    static void hello() {
        System.out.println("Hello World!");
    }

    // find max value by using array
    static int max(int[] arg1) {
        int max = arg1[0];
        for (int i = 1; i < arg1.length; i++) {
            if (max < arg1[i]) {
                max = arg1[i];
            }
        }
        return max;
    }

    // overload method
    static int max(int a, int b) {
        return a > b ? a : b;
    }

    static int max(int a, int b, int c) {
        int max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        // int[] param1 = { 38, 59, 98, 73, 99 };
        // int result = power(2, 3);
        // System.out.println("Result: " + result);
        // hello();
        System.out.println(max(6, 2, 3));
        System.out.println(max(1, 60));
    }
}
