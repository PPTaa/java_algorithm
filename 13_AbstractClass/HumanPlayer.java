import java.util.Scanner;

public class HumanPlayer extends Player {
    
    private static Scanner scanner;

    static{
        scanner = new Scanner(System.in);
    }

    @Override
    public int nextHand() {
        do {
            System.out.println("가위 바위 보 / 0:가위 /1:바위 /2:보");
            hand = scanner.nextInt();
        } while (hand<0||hand>2);    
        return hand;
    }
    
}