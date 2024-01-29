@SuppressWarnings("all")
public class CountNumbers {
    public static void main(String[] args) {
        // Step 1
        /*
         * Scanner uInput = new Scanner(System.in);
         * System.out.println("Enter your numbers: ");
         * long uNum = uInput.nextLong();
         * System.out.println("Your input is " + uNum);
         * long count = 1;
         * for (long i = 1; i < Math.abs(uNum); i *= 10) {
         * count++;
         * 
         * }
         * System.out.println("Your Number count is " + count);
         */

        // Step 2
        int num = 1234567;
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println("Count is " + count);
    }

}
