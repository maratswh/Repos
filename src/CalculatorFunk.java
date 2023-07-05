import java.util.Scanner;

public class CalculatorFunk {
    public static void main(String... args) {
        int firstNumber = 0;
        int secondNumber = 0;
        int operator = 0;
        boolean swither = true;
        String operands[] = {"1 Сложение", "2 вычитание", "3 умножение", "4 деление"};
        String instructions[] = {"Snachala vvodish chisla", "zatem vibirayesh"};
        String  results[] = new String[5];
        int firstNumbers[] = new int[5];
        int secondNumbers[] = new int[5];

        int i=0;
        while (i<5) {


            printmassive(instructions);

            Scanner scanner = new Scanner(System.in);

            firstNumber = readNumber(scanner, "only numbers");
            firstNumbers[i]=firstNumber;


            String stroka = "Only numbers 1 2 3 4 5";

            secondNumber = readNumber(scanner, "only numbers");
            printmassive(operands);
            secondNumbers[i]=secondNumber;

            while (scanner.hasNextInt()) {
                operator = readNumber(scanner, stroka);
                if (operator < 7 && operator > 0) {
                    break;
                } else {
                    System.out.println("___");
                    scanner.next();
                }
            }

            switch (operator) {
                case 1:
                    System.out.println(operands[operator - 1] + "сложение A=" + firstNumber + " +" + "B= " + secondNumber + "=" + (firstNumber + secondNumber));
                    results[i]=firstNumber+secondNumber+"result"+(i+1);
                    i++;
                    break;
                case 2:
                    System.out.println("выет A=" + firstNumber + " -" + "B= " + secondNumber + "=" + (firstNumber - secondNumber));
                    results[i]=firstNumber-secondNumber+"result"+(i+1);
                    i++;
                    break;
                case 3:
                    System.out.println("умножене A=" + firstNumber + " *" + "B= " + secondNumber + "=" + (firstNumber * secondNumber));
                    results[i]=firstNumber*secondNumber+"result"+(i+1);
                    i++;
                    break;
                case 4:
                    System.out.println("деление A=" + firstNumber + " /" + "B= " + secondNumber + "=" + (firstNumber / secondNumber));
                    results[i]=firstNumber/secondNumber+"result"+(i+1);
                    i++;
                    break;
                case 5:
                    if (firstNumber == secondNumber) {
                        System.out.println(firstNumber + "а=б" + secondNumber);
                        results[i]="ravni"+" result"+i+1;
                        i++;
                    } else {
                        System.out.println(firstNumber > secondNumber ? (firstNumber + "  больше " + secondNumber) : (secondNumber + " больше " + firstNumber));
                        results[i]=firstNumber > secondNumber ? (firstNumber+">"+secondNumber+" result"+i+1):(firstNumber+"<"+secondNumber+" result"+i+1);
                        i++;
                    }
                    break;
                default:
                    System.out.println("  1  1");
                    break;
            }
        }
        for (int j=0; j<results.length; j++) {
            System.out.println(firstNumbers[j] +" "+ secondNumbers[j]+" = " + results[j]);
        }
    }

    public static int readNumber(Scanner scanner, String stroca) {

        while (!scanner.hasNextInt()) {
            System.out.println(stroca);
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static void printmassive(String[] massive) {
        for (int i = 0; massive.length > i; i++) {
            System.out.println(massive[i]);
        }
    }

    public static void printIntMasiive(int[] massive) {
        for (int i = 0; massive.length > i; i++) {
            System.out.println(massive[i]);
        }
    }


}
