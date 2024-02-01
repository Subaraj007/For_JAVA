/**
 * @author Subaraj
 */

public class FindMaxOfArray {
    public static void main(String[] args) {
        int[] a1 = { 20, 30, 20, 40, 60, 60 };
        int max = a1[0];
        for (int i = 1; i < a1.length; i++) {
            if (a1[i] > max) {
                max = a1[i];
            }
        }
        System.out.println("Maximum is " + max);
    }
}
