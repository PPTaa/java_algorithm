public class WearableComputer implements Wearable {

    @Override
    public void putOn() {
       System.out.println("컴퓨터를 실행");
    }

    @Override
    public void putOff() {
        System.out.println("컴퓨터를 종료");
    }
    
    public void reset(){
        System.out.println("컴퓨터를 재시작");
    }
    
}