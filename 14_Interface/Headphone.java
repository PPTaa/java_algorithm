public class Headphone implements Wearable {
    int volume = 0;

    @Override
    public void putOn() {
        System.out.println("헤드폰 착용");
    }

    @Override
    public void putOff() {
        System.out.println("헤드폰 벗음");
    }
    
    public void setVolume(int volume){
        this.volume = volume;
        System.out.println("볼륨을"+volume+"으로 변경했습니다.");
    }
    
}