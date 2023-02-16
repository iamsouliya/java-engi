public class BooleanEx {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("You should input params atleast two");
            System.exit(1);
        }
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        System.out.println("x & y = " + x + ", " + y);
        // System.out.println("y = " + y);

        System.out.println("x > y   " + (x > y));
        System.out.println("x < y " + (x < y));
        System.out.println("x = y " + (x == y));
        System.out.println("x != y " + (x != y));
    }
}
