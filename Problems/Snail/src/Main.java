import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = (h-a)/(a-b)+1;
        if ((h-a)%(a-b)>0) result ++;
        System.out.println(result);
    }
}