import java.util.Scanner;

@SuppressWarnings("all")
public class ReverseStringBuilder {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String userName = userInput.nextLine();

        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(userName);
        sBuilder.reverse();
        System.out.println("After reverse: " + sBuilder);
    }
}
