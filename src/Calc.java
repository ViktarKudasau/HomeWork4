import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        double number_one;
        double number_two;
        double result;

        while (true) {
            System.out.println("Введите первое число:");
            Scanner scanner = new Scanner(System.in);
            number_one = scanner.nextDouble();

            System.out.println("Введите знак операции +,-,/,* :");
            Scanner scanner2 = new Scanner(System.in);
            String operation = scanner2.nextLine();
            while ((!operation.equals("+")) && (!operation.equals("-")) && (!operation.equals("*"))
                    && (!operation.equals("/"))){
                System.out.println("Несуществующий знак операции. Попробуйте еще раз. Введите знак операции +,-,* или /   :");
                operation = scanner2.nextLine();
            }

            System.out.println("Введите второе число:");
            number_two = scanner.nextDouble();
            while ((operation.equals("/")) && (number_two == 0)){
                System.out.println("Деление на '0' запрещено. Введите второе число еще раз:");
                number_two = scanner.nextDouble();

            }
            if (operation.equals("+")){
                result = number_one + number_two;
                System.out.printf("Результат = %s%n", result);
            }

            if (operation.equals("-")){
                result = number_one - number_two;
                System.out.printf("Результат = %s%n", result);
            }

            if (operation.equals("*")){
                result = number_one * number_two;
                System.out.printf("Результат = %s%n", result);
            }
            if (operation.equals("/")){
                result = number_one / number_two;
                System.out.println(String.format("Результат = %s", result));
            }

            System.out.println("Хотите продолжить? 'да' или 'нет' :");
            String answer = scanner2.nextLine();
            while ((!answer.equalsIgnoreCase("нет")) && (!answer.equalsIgnoreCase("да"))){
                System.out.println("Некорректное выражение. Желаете продолжить 'да' или 'нет' ?:");
                answer = scanner2.nextLine();
            }
            if (answer.equalsIgnoreCase("нет")){
                System.out.println("Вы вышли из приложения!");
                break;
            }
        }
    }   
}

