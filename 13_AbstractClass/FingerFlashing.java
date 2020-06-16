import java.util.Random;
import java.util.Scanner;

public class FingerFlashing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        HumanPlayer hp = new HumanPlayer();
        ComputePlayer cp = new ComputePlayer();

        String[] hands = {"가위","바위","보"};

        int retry;
        do {
            int user = hp.nextHand();
            int com = cp.nextHand();

            System.out.println("{나 : "+hands[user]+"} vs {컴퓨터 : "+hands[com]+"}");

            int judge = (user-com+3) % 3;
            switch (judge) {
                case 0: System.out.println("비겼습니다.");
                    break;
                case 1: System.out.println("당신이 이겼습니다.");
                    break;
                case 2: System.out.println("당신이 졌습니다.");
                    break;
            }
            do {
                System.out.println("re:1, out:0");
            retry = scanner.nextInt();
            } while (retry !=0 && retry != 1);
        } while (retry == 1);


    }
}   