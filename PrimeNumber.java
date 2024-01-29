import java.util.Scanner;

@SuppressWarnings("all")
public class PrimeNumber {

    public static void main(String[] args) {
        Scanner uIp = new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int uNum = uIp.nextInt();

        if (uNum > 1 && isPrime(uNum)) {
            System.out.println(uNum + " is a prime number.");
        } else {
            System.out.println(uNum + " is not a prime number.");
        }
    }

    // Function to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
