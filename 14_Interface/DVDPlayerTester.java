public class DVDPlayerTester {
    public static void main(String[] args) {
        DVDPlayer a = new DVDPlayer();
        Players b = new DVDPlayer();
        ExPlayer c = new DVDPlayer();

        System.out.println("DVDPlayer");
        a.play();
        a.stop();
        a.slow();

        System.out.println("Players");
        b.play();
        b.stop();

        System.out.println("ExPlayer");
        c.play();
        c.stop();
        c.slow();
    }
}