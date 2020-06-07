import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = 0;
        int element;

        for (int i = 1; i < n; i++) {
            element = scanner.nextInt();
            if (element % 4 == 0 && element > max) {
                max = element;
            }
        }
        System.out.println(max);

    }
}
