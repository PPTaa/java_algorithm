/**
 * HumanTester_04
 */
public class HumanTester_04 {

    public static void main(String[] args) {
        Human_04 human1 = new Human_04("길동", 170, 60);
        Human_04 human2 = new Human_04("철수", 166, 72);

        human1.putData();
        System.out.println("id : "+human1.getId());
        human2.putData();
        System.out.println("id : "+human2.getId());
    }
}