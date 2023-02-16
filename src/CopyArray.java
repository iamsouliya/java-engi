public class CopyArray {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3 };
        int arr2[] = { 10, 20, 30, 40 };

        if (arr1.length != arr2.length) {
            arr2 = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr2[i] = arr1[i];
            }
        }
        for (int i : arr2) {
            System.out.println(i);
        }
    }
}
