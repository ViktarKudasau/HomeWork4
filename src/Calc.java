import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        double n1;
        double n2;
        double result;
        String exit;
        String answer;

        while (true) {
            System.out.println("Введите первое число:");
            Scanner scanner = new Scanner(System.in);
            n1 = scanner.nextDouble();

            System.out.println("Введите знак операции +,-,/,* :");
            Scanner scanner2 = new Scanner(System.in);
            String operation = scanner2.nextLine();
            while ((!operation.equals("+")) && (!operation.equals("-")) && (!operation.equals("*"))
                    && (!operation.equals("/"))){
                System.out.println("Несуществующий знак операции. Попробуйте еще раз. Введите знак операции +,-,* или /   :");
                operation = scanner2.nextLine();
            }

            System.out.println("Введите второе число:");
            n2 = scanner.nextDouble();
            while ((operation.equals("/")) && (n2 == 0)){
                System.out.println("Деление на '0' запрещено. Введите второе число еще раз:");
                n2 = scanner.nextDouble();

            }
            if (operation.equals("+")){
                result = n1 + n2;
                System.out.println(String.format("Результат = %s", result));
                System.out.println("Хотите продолжить? 'да' или 'нет' :");
                answer = scanner2.nextLine();
                if (answer.equalsIgnoreCase("нет")){
                    System.out.println("Вы вышли из приложения!");
                    break;
                }
            }
            if (operation.equals("/")){
                result = n1 / n2;
                System.out.println(String.format("Результат = %s", result));
                System.out.println("Хотите продолжить? 'да' или 'нет' :");
                answer = scanner2.nextLine();
                if (answer.equalsIgnoreCase("нет")){
                    System.out.println("Вы вышли из приложения!");
                    break;
                }
            }

        }

    }   
}

