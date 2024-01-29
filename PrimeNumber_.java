import java.util.Scanner;

@SuppressWarnings("all")

public class PrimeNumber_ {
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        System.out.println("Enter a NUmber: ");
        int uNum = uInput.nextInt();

        if (uNum > 1) {
            int count = 1;
            for (int i = 2; i <= Math.sqrt(uNum); i++) {
                if (uNum % i == 0) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println("This is prime number.");
            }

            else {
                System.out.println("This is not prime number.");
            }
        } else {
            System.out.println("Enter a number greater than one.");
        }
    }
}
