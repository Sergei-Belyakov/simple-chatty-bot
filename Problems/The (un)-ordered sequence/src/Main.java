import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean ascen = true;
        boolean descen = true;
        int maxAscen = num;
        int minDescen = num;
        do {
            if (num >= maxAscen && ascen) {
                maxAscen = num;
            } else {
                ascen = false;
            }
            if (num <= minDescen && descen) {
                minDescen = num;
            } else {
                descen = false;
            }
            num = scanner.nextInt();
        } while (num != 0);

        if (ascen || descen) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}