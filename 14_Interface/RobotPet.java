public class RobotPet extends Pet {

    public RobotPet(String name, String masterName) {
        super(name, masterName);
    }

    public void introduce (){
        System.out.println("로봇 이름: " + getName());
        System.out.println("주인 이름: " + getMasterName());
    }

    public void work(int sw){
        switch (sw) {
            case 0: System.out.println("청소"); break;
            case 1: System.out.println("세탁"); break;
            case 2: System.out.println("밥"); break;
        }
    }
    
}