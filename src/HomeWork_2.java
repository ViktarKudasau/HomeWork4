import java.util.Objects;
import java.util.Scanner;

        public class HomeWork_2 {
            public static void main(String[] args) {
                String RealPassword = "doc_1";
                System.out.print("Enter your password:");
                Scanner scan = new Scanner(System.in);
                String UserPassword = scan.nextLine();

                if (Objects.equals(UserPassword, "exit")) {
                    System.out.println("Session ended by user");
                    return;
                }
                while (!Objects.equals(UserPassword, RealPassword)) {
                    System.out.println("The Password is incorrect. Try again:");
                    UserPassword = scan.nextLine();
                    if (Objects.equals(UserPassword, "exit")) {
                        System.out.println("Session ended by user");
                        break;
                    }
                }
                if (Objects.equals(UserPassword, RealPassword)) {
                    System.out.println("The password is correct. You are logged in");
                }
            }
}
