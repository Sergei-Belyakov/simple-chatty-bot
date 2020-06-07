import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();
        double percent = scanner.nextDouble();
        double moneyBack = scanner.nextDouble();
        int year = 0;

        while (money < moneyBack) {
            money = money + money * percent / 100;
            year++;
        }

        System.out.println(year);
    }
}