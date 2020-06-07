import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 1;
        int squares = s * s;

        while (squares <= n) {
            System.out.println(squares);
            s++;
            squares = s * s;
        }

    }
}