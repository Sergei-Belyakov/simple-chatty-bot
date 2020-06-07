import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int grade;

        for (int i = 0; i < k; i++) {
            grade = scanner.nextInt();
            switch (grade) {
                case 5: a++;
                        break;
                case 4: b++;
                        break;
                case 3: c++;
                        break;
                case 2: d++;
                        break;
                default: break;
            }
        }

        System.out.println(d + " " + c + " " + b + " " + a);
    }
}
