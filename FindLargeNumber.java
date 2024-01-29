@SuppressWarnings("all")
public class FindLargeNumber {
    public static void main(String[] args) {
        // Method 1
        /*
         * int a = 3, b = 8, c = 5;
         * int max;
         * if (a > b & a > c) {
         * System.out.println("Maxium number is " + a);
         * } else if (b > a & b > c) {
         * System.out.println("Maxium number is " + b);
         * 
         * } else {
         * System.out.println("Maxium number is " + c);
         * 
         * }
         */
        // Method 2 Tenary Operator
        int a = 4, b = 7, c = 3;
        int largest1 = a > b ? a : b;
        int largest2 = c > largest1 ? c : largest1;
        System.out.println("Largest number is " + largest2);

    }
}
