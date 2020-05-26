public class HumanTester_01 {
    public static void main(String[] args) {
        Human_01 gildong = new Human_01();
        Human_01 chulsu = new Human_01();

        gildong.name = "길동";
        gildong.height = 170;
        gildong.weight = 60;

        chulsu.name = "철수";
        chulsu.height = 166;
        chulsu.weight = 72;

        System.out.println(gildong.name);
        System.out.println(gildong.weight);
        System.out.println(gildong.height);

        System.out.println(chulsu.name);
        System.out.println(chulsu.weight);
        System.out.println(chulsu.height);
    }
}