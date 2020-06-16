import java.util.Random;

public class ComputePlayer extends Player {

    private static Random random;

    static {
        random = new Random();
    }

    @Override
    public int nextHand() {
        return random.nextInt(3);
    }
    
}