import java.util.Scanner;

public class Calculator {
    public static void main(String... args) {
        int firstNumber = 0;
        int secondNumber = 0;
        int operator = 0;
        String l[] = {"1 Сложение", "2 вычитание", "3 умножение", "4 деление"};
        for (int i = 0; i < 4; i++) {
            System.out.println(l[i]);
        }
        System.out.println("Вводишь а потом secondNumber потом вводишь");

        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("Only numbers");
            scanner.next();
        }
        firstNumber = scanner.nextInt();

        while (!scanner.hasNextInt()) {
            System.out.println("Only numbers");
            scanner.next();
        }
        secondNumber = scanner.nextInt();
        while (true) {
            while (!scanner.hasNextInt()) {
                System.out.println("Only numbers 1 2 3 4 5");
                scanner.next();
            }
            operator = scanner.nextInt();
            if (operator < 6 && operator > 0) {
                break;
            } else {
                System.out.println("___");
                scanner.next();
            }
        }
        switch (operator) {
            case 1:
                System.out.println(l[operator - 1] + "сложение A=" + firstNumber + " +" + "B= " + secondNumber + "=" + (firstNumber + secondNumber));
                break;
            case 2:
                System.out.println("выет A=" + firstNumber + " -" + "B= " + secondNumber + "=" + (firstNumber - secondNumber));
                break;
            case 3:
                System.out.println("умножене A=" + firstNumber + " *" + "B= " + secondNumber + "=" + (firstNumber * secondNumber));
                break;
            case 4:
                System.out.println("деление A=" + firstNumber + " /" + "B= " + secondNumber + "=" + (firstNumber / secondNumber));
                break;
            case 5:
                if (firstNumber == secondNumber) {
                    System.out.println(firstNumber + "а=б" + secondNumber);
                } else {
                    System.out.println(firstNumber > secondNumber ? (firstNumber + "  больше " + secondNumber) : (secondNumber + " больше " + firstNumber));
                }
                break;
            default:
                System.out.println("  1  1");
                break;
        }
        System.out.println(operator);
    }

}
