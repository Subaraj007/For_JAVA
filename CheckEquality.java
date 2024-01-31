import java.util.Arrays;

@SuppressWarnings("all")
public class CheckEquality {
    public static void main(String[] args) {
        int a1[] = { 2, 5, 3, 6, 4 };
        int a2[] = { 2, 5, 3, 6, 4 };

        int a3[] = { 5, 6, 4, 7, 8 };
        boolean checkEquality = Arrays.equals(a1, a2);

        if (checkEquality == true) {
            System.out.println("This is equal array.");
        } else {
            System.out.println("This is not equal array.");

        }
    }
}
