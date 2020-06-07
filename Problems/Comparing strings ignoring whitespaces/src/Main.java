import  java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String linesOne = scanner.nextLine();
        String linesTwo = scanner.nextLine();

        String noWhitespacesLinesOne = linesOne.replace(" ", "");
        String noWhitespacesLinesTwo = linesTwo.replace(" ", "");

        System.out.println(noWhitespacesLinesOne.equals(noWhitespacesLinesTwo));

    }
}