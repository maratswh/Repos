import java.util.Scanner;

public class DaysOfWeekSwitch {
    public static void main(String... args) {
        System.out.println("1. Понедельник");
        System.out.println("2. Вторник");
        System.out.println("3. Среда");
        System.out.println("4. Четверг");
        System.out.println("5. Пятница");
        System.out.println("6. Суббота");
        System.out.println("7. Воскресенье");
        System.out.println("Введите номер : ");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                switch (scanner.nextInt()) {
                    case 1:
                        System.out.println("Понедельник");
                       return;
                    case 2:
                        System.out.println("Вторник");
                        return;
                    case 3:
                        System.out.println("Среда");
                        return;
                    case 4:
                        System.out.println("Четверг");
                        return;
                    case 5:
                        System.out.println("Пятница");
                        return;
                    case 6:
                        System.out.println("Суббота");
                        return;
                    case 7:
                        System.out.println("Воскресенье");
                        return;

                    default:
                        System.out.println("WRONG INTER");
                        break;
                }
            } else {
                System.out.println("WRONG INTER");
                scanner.next();
            }
        }
    }
}

