import java.util.Scanner;

public class DaysOfWeekArray {
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
        for (int i = 0; i < daysOfWeek.length; i++) {
            int dayNumber = i + 1;
            System.out.println(dayNumber + ". " + daysOfWeek[i]);
        }
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
                if (s > 7 || 1 > s) {
                    System.out.println("wrong");
                } else {
                    inputIsValid = true;// какое должно ьыть условие чтоб без else
                }
            }
        }

        System.out.println(daysOfWeek[s - 1]);
    }
}

