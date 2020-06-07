import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum = 0;


        while (true) {
            num = scanner.nextInt();
            if (num == 0) {
                break;
            } else {
                sum += num;
            }
            if (sum >= 1000) {
                sum -= 1000;
                break;
            }

        }
        System.out.println(sum);

    }
}
