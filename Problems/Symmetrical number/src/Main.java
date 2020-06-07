import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int a1 = num / 1000;
        int a2 = num % 1000 / 100;
        int a3 = num % 100 / 10;
        int a4 = num % 10;

        if (a1 == a4 && a2 == a3 ) {
            System.out.println("1");
        } else {
            System.out.println("2");
        }
    }
}