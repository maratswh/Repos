import java.util.Scanner;

public class DaysOfWeekArrayFunk {
    public static void main(String... args) {
        String[] daysOfWeek = {
                "Понедельник"
                , "Вторник"
                , "Среда"
                , "Четверг"
                , "Пятница"
                , "Суббота"
                , "Воскресенье"
        };
        printDays(daysOfWeek);
        System.out.print("Введите номер :");
        Scanner scanner = new Scanner(System.in);
        boolean inputIsValid = false;
        int s = 0;
        while (!inputIsValid) {
            if (!scanner.hasNextInt()) {
                System.out.println("not number");
                scanner.next();
            } else {
                s = scanner.nextInt();
                if (check(s)) {
                    System.out.println("wrong");
                } else {
                    inputIsValid = true;// какое должно ьыть условие чтоб без else
                }
            }
        }

        System.out.println(daysOfWeek[s - 1]);
    }

    public static void printDays(String[] massive) {
        for (int i = 0; i < massive.length; i++) {
            int dayNumber = i + 1;
            System.out.println(dayNumber + ". " + massive[i]);
        }
    }


    public static boolean check(int number) {
        return number > 7 || 1 > number;
    }

}


