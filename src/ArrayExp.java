public class ArrayExp {
    public static void main(String[] args) {
        int scores[];
        scores = new int[4];

        scores[0] = 100;
        scores[1] = 50;
        scores[2] = 60;
        scores[3] = 70;

        // System.out.println(scores[0]);
        // System.out.println(scores[1]);
        // System.out.println(scores[2]);
        // System.out.println(scores[3]);

        for (int i = 0; i < scores.length; i++) {
            System.out.println("print scores " + scores[i]);
        }
    }
}
