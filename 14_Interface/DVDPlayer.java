public class DVDPlayer implements ExPlayer {

    @Override
    public void play() {
        System.out.println("재생");
    }

    @Override
    public void stop() {
        System.out.println("정지");
    }

    @Override
    public void slow() {
        System.out.println("느리게");
    }
    
}