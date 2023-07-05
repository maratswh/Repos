import java.util.Scanner;

public class CalcOfHealthMan {
    public static void main(String... args) {



        Scanner scanner = new Scanner(System.in);
        float res = 0, num1, num2;
        int counter = 0;
        String[] allResults = new String[4];

        System.out.print("Введите 1 число:");



        num1 = cheking(scanner, "Only numbeers");
        allResults[counter] = String.valueOf(num1);


        System.out.print("Введите 2 число:");

        num2 = cheking(scanner, "Only Numbers");


        System.out.print("Введите мат операцию");
        String operand = scanner.nextLine();
        operand = scanner.nextLine();
        switch (operand) {
            case "+":
                res = summ3(num1, num2);
                System.out.println(res);
                break;
            case "-":
                res = minus(num1, num2);
                System.out.println(res);
                break;
            case "*":
                res = umnj(num1, num2);
                System.out.println(res);
                break;
            case "/":
                while (num2 == 0) {
                    System.out.println("На ноль делить нельзя измени 2 число");
                    num2 = cheking(scanner, "only numbers>0");
                }
                res = delit(num1, num2);
                System.out.println(res);
                break;
            case "=":
                System.out.println(num1 + sravnenie(num1, num2) + num2);

                break;
            default:
                System.out.println("YOU DIED....");
        }
    }

    public static int cheking(Scanner scanner, String stroca) {

        while (!scanner.hasNextInt()) {
            System.out.println(stroca);
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static float summ(float a, float b) {

        return a + b;
    }

    public static float minus(float a, float b) {
        return a - b;
    }

    public static float umnj(float a, float b) {
        return a * b;
    }

    public static float delit(float a, float b) {
        return a / b;
    }

    public static String sravnenie(float a, float b) {
        if (a > b) {
            return ">";
        } else if (a < b) {
            return "<";
        }
        return "=";
    }

    public static float summ2(float a, float b) {
        for (float i = 1; i <= b; i++) {
            a++;
        }
        return a;
    }

    public static float summ3(float a, float b) {
        return summ3Internal(a, b, 0);

    }

    public static float summ3Internal(float a, float b, float c) {
        if (c == b) {
            return a;
        }
        return summ3Internal(++a, b, ++c);
    }

}



