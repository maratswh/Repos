import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String... args) {
        int q;
        int w;
        System.out.println("Введите число : ");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()){
                System.out.println("Буквы не умножаю( попробуй еще раз");
                scanner.next();
        }
        w = scanner.nextInt();
        for (int a=1; a<11; a++){
            q=w*a;
            System.out.println(a+" * "+w+" = "+q);
        }
    }

}
