import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
        String userPassword = "Пароль";
        String exit = "Выход";
        System.out.println("Введите пароль:");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

            while (!password.equals(userPassword)) {
                if (password.equals(exit)) {
                    System.out.println("Вы вышли из системы");
                    break;
                } else {
                    System.out.println("Неверный пароль, введите пароль ещё раз:");
                    password = scanner.nextLine();
                }
            }
            if (password.equals(userPassword)) {
                System.out.println("Вы вошли в систему!");
            }
        }
    }
