import java.util.Scanner;

@SuppressWarnings("all")
public class ReverseUseLoop {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String uString = userInput.nextLine();
        int lengthString = uString.length();
        String rev = "";

        for (int i = lengthString - 1; i >= 0; i--) {
            rev = rev + uString.charAt(i);
        }
        System.out.println("After reverse: " + rev);
    }
}
