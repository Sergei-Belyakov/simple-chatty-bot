import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        long factorial = 1;
        int num;

        for (int i = 1;  ; i++) {
            factorial *= i;
            if (factorial > m) {
                num = i;
                break;
            }
        }

        System.out.println(num);
    }
}
