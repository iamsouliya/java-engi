public class MethodExp1 {
    static int findMax(int a, int b) {
        int max = a;
        if (b > max) {
            max = b;
        }
        return max;
    }

    static int findMaxTwo(int a, int b, int c) {
        int max = a;
        return max;
    }

    public static void main(String[] args) {
        int param1 = 30131;
        int param2 = 10;
        int result = findMax(param1, param2);

        if (result != 0) {
            System.out.println("Result: " + result);
        }
    }
}
