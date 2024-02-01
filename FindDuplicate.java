import java.util.ArrayList;

/**
 * @author Subaraj
 */
public class FindDuplicate {
    public static void main(String[] args) {
        int[] a1 = { 1, 2, 5, 4, 6, 2, 7, 6, 8, 3, 6 };
        ArrayList<Integer> check = new ArrayList<>();

        for (int i = 0; i < a1.length; i++) {
            for (int j = i + 1; j < a1.length; j++) {
                if (a1[i] == a1[j] && !check.contains(a1[i])) {
                    check.add(a1[i]);
                }
            }
        }

        System.out.println("Duplicate elements: " + check);
    }
}
