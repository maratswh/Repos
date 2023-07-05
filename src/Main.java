import java.util.Arrays;

public class Main {
    public static void main(String... args) {
        int n = summation(3),number=0;
        int[] numbers = {1, -2, -4, 5, 6, 3, -5, 12, -3, -28, 11,};
        int[] scores={1,2,3};
        String name,owner;
        switch (number){
            case (1):
                String a="One";
            case (2):
                String b="Two";
            case (3):
                String c="Three";
            case (4):
                String d="Four";
            case (5):
                String e="Five";
            case (6):
                String q="Six";
            case (7):
                String w="Seven";
            case (8):
                String j="Eight";
            case (9):
                String r="Nine";

        }


       String[] games={"1:1","2:2","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"};
       System.out.println(points(games));
    }

    public static int points(String[] games){
        int sum = 0;

        for (String s : games) {
            char x = s.charAt(0),
                    y = s.charAt(2);

            sum += x > y ? 3 : x == y ? 1 : 0;
        }

        return sum;
    }
    public static int summation(int n) {

        return n == 1 ? 1 : n + summation(n-1);
    }

    public static String[] arrayFill(int a) {
        String[] array = new String[a];
        for (int i = 0; i < a; i++) {
            array[i] = i+1+" sheep...";
        }
        return array;
    }

    public static int[] arrFil2(int a) {
        int[] array = new int[a];
        for (int i = 0; i<array.length; i++){
            array[i]=i+1;
        }
        return array;
    }

    public static int[] countOfPosANeg(int[] array) {
        int p = 0, n = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                n = n + array[i];
            } else {
                p = p + array[i];
            }
        }
        int[] res = {p, n};
        return res;
    }

    public static void invert(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            array[i] = -temp;
        }
    }
}


