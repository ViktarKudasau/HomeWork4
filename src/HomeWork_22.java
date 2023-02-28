import java.util.Objects;
import java.util.Scanner;

public class HomeWork_22 {
    public static void main(String[] args) {
        String RealPassword = "doc_1";
        System.out.print("Enter your password:");
        Scanner scan = new Scanner(System.in);
        String UserPassword = scan.nextLine();

        while (!Objects.equals(UserPassword, RealPassword)) {
            if (Objects.equals(UserPassword, "exit")) {
                System.out.println("Session ended by user");
                break;
            }
            System.out.println("The Password is incorrect. Try again:");
            UserPassword = scan.nextLine();
        }
        if (Objects.equals(UserPassword, RealPassword)) {
            System.out.println("The Password is correct. You are logged in");
        }
    }
}
