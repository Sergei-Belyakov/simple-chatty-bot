import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int element;

        for (int i = 0; i < n; i++) {
            element = scanner.nextInt();
            if (element % 6 == 0) {
                sum += element;
            }
        }
        System.out.println(sum);

    }
}
