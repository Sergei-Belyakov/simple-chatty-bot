import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        boolean num1AboveZero = num1 > 0 && num2 <= 0 && num3 <= 0;
        boolean num2AboveZero = num1 <= 0 && num2 > 0 && num3 <= 0;
        boolean num3AboveZero = num1 <= 0 && num2 <= 0 && num3 > 0;


        System.out.println(num1AboveZero ^ num2AboveZero ^ num3AboveZero);
    }
}