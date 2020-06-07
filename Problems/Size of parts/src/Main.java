import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int larger = 0;
        int smaller = 0;
        int perfect = 0;
        int size;

        for (int i = 0; i < k; i++) {
            size = scanner.nextInt();
            switch (size) {
                case -1: smaller++;
                    break;
                case 0: perfect++;
                    break;
                case 1: larger++;
                    break;
                default: break;
            }
        }

        System.out.println(perfect + " " + larger + " " + smaller);
    }
}
