
import java.util.Scanner;

@SuppressWarnings("all")
public class ReverseString {
    // String buffer type
    public static void main(String[] args) {
        while (true) {

            Scanner userInput = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String userName = userInput.nextLine();
            if ("exit".equalsIgnoreCase(userName)) {
                System.out.println("Bye Bye");
                break;
            } else {
                System.out.println("Username is " + userName);
                StringBuffer scBuffer = new StringBuffer(String.valueOf(userName));
                StringBuffer rev = scBuffer.reverse();
                System.out.println("Reverse your name is " + rev);
            }
        }
    }

}
