import java.util.Scanner;

@SuppressWarnings("all")
public class Palindrome {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter user name: ");
        String userInput = myInput.nextLine();
        StringBuffer sBuffer = new StringBuffer(String.valueOf(userInput));
        StringBuffer rev = sBuffer.reverse();
        // System.out.println(rev);
        String revString = rev.toString();
        if (userInput.equals(revString)) {
            System.out.println(userInput + " This is palindrome.");

        } else {
            System.out.println(userInput + " This is not palindrome.");
        }

    }
}
