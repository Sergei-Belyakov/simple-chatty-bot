import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peanutCups = scanner.nextInt();
        boolean weekEnd = scanner.nextBoolean();

        System.out.println(((peanutCups>=10 && peanutCups<=20) && weekEnd == false) ^ ((peanutCups>=15 && peanutCups<=25) && weekEnd == true));
    }
}