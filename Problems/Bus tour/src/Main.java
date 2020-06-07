import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int countBridge = scanner.nextInt();
        int bridgeCrash = 0;

        for (int i = 1; i <= countBridge; i++) {
            int heightBridge = scanner.nextInt();
            if (height >= heightBridge && bridgeCrash == 0) {
                bridgeCrash = i;
            }
        }

        if (bridgeCrash == 0) {
            System.out.println("Will not crash");
        } else {
            System.out.println("Will crash on bridge " + bridgeCrash);
        }
    }
}