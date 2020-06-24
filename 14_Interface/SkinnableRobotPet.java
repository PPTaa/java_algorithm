public class SkinnableRobotPet extends RobotPet implements Skinnable {

    private int skin;

    public SkinnableRobotPet(String name, String masterName) {
        super(name, masterName);
    }

    @Override
    public void changeSkin(int skin) {
        this.skin = skin;
    }

    public void printSkin(){
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