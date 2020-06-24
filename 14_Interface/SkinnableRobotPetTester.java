/**
 * SkinnableRobotPetTester
 */
public class SkinnableRobotPetTester {
    static void intro(Pet p){
        p.introduce();
    }
    public static void main(String[] args) {
        Pet[] a = {
            new Pet("Pet1", "1번"),
            new RobotPet("RobotPet", "2번"),
            new SkinnableRobotPet("SkinnableRobotPet", "3번"),
            new Pet("Pet2", "4번")
        };

        for(Pet p : a){
            intro(p);
            if (p instanceof SkinnableRobotPet){
                System.out.print("스킨 : ");
                ((SkinnableRobotPet)p).printSkin();
            }
            System.out.println();
        }
    }
}