import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = 0;
        int i = 0;
        int num;

        while (i < n) {
            num = scanner.nextInt();
            if (num % 4 == 0 && num > max) {
                max = num;
            }
            i++;
        }

        System.out.println(max);

    }
}