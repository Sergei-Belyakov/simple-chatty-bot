import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String strCompare = str.toUpperCase();

        System.out.println(strCompare.startsWith("J"));
    }
}