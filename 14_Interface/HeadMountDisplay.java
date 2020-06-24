public class HeadMountDisplay implements Wearable, Skinnable {

    private int skin;

    @Override
    public void changeSkin(int skin) {
        this.skin = skin;
        System.out.println("스킨변경");
    }

    @Override
    public void putOn() {
        System.out.println("착용");
    }

    @Override
    public void putOff() {
        System.out.println("해제");
    }

    public void putSkin(){
        switch (skin) {
            case BLACK:System.out.println("검정");                
                break;
            case RED:System.out.println("빨강");                
                break;
            case GREEN:System.out.println("초록");                
                break;
            case BLUE:System.out.println("파랑");                
                break;
            case YELLOW:System.out.println("노랑");                
                break;
        }
    }
    
}