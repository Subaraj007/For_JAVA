import java.util.Scanner;

@SuppressWarnings("all")
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter user name: ");
        int userInt = userInput.nextInt();
        int rev = 0;
        while (userInt > 0) {
            rev = rev * 10 + userInt % 10;
            userInt = userInt / 10;
        }
        System.out.println("After reverse number is " + rev);

    }

}
