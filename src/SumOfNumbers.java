import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String... args) {
        //Есть произвольное целое число надо вывести сумму всех цифр этого числа
        //Например число равно 12345 результат должен быть равен 1+2+3+4+5
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("hz");
            scanner.next();
        }
        int number = scanner.nextInt();
        int result = 0;
        while (number != 0) {
            result = number % 10 + result;
            number = number / 10;
        }
        if (result < 0) {
            result = -result;
        }
        System.out.println(number);
        System.out.println(result);
        Integer.valueOf(result);


    }
}
