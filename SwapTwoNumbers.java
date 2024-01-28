@SuppressWarnings("all")
public class SwapTwoNumbers {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before swepping: a=" + a + " b=" + b);
        int t = a;
        a = b;
        b = t;

        System.out.println("After Swepping: a=" + a + " b=" + b);

    }
}