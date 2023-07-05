import java.util.Scanner;

public class SummOfNumCircle {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int num, result;
        num = chekInt(scanner, "I am waiting a number");
        System.out.println(num);
        //result=summofnumbers(num);
        result = circle2(num);
        System.out.println(result);


    }

    public static int chekInt(Scanner scanner, String comment) {
        while (!scanner.hasNextInt()) {
            System.out.println(comment);
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static int summofnumbers(int number) {
        int summOf = 0;
        while (number != 0) {
            summOf = number % 10 + summOf;
            number = number / 10;
        }
        return summOf;
    }


    public static int circle2(int num) {
        if (num != 0) {

            return (num % 10)+ circle2( num / 10);
        }

        return 0;
    }
}
