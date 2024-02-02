/**
 * @author Subaraj
 */

public class ConditionsUseFunc {

    public static void main(String[] args) {
        int result = g();
        System.out.println("Result: " + result);
    }

    static int f1(int x, int y) {
        if (x < y) {
            System.out.println("X < Y");
            return y + x;
        } else {
            System.out.println("X >= Y");
            if (x > 8) {
                return y + 7;
            }
            return x - 2;
        }
    }

    static int g() {
        int a = f1(3, 4);
        return f1(a, 5);
    }
}
