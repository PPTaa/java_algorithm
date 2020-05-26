public class HumanTester_02 {
    public static void main(String[] args) {
        Human_02 gildong = new Human_02("길동", 170, 60);
        Human_02 chulsu = new Human_02("철수", 166, 72);

        gildong.gainWeight(3);
        chulsu.reduceWeight(5);

        System.out.println(gildong.getName());
        System.out.println(gildong.getHeight());
        System.out.println(gildong.getWeight());

        System.out.println(chulsu.getName());
        System.out.println(chulsu.getHeight());
        System.out.println(chulsu.getWeight());
    }
}