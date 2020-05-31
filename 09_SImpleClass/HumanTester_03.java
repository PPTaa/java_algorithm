public class HumanTester_03 {
    public static void main(String[] args) {
        Day_01 d1 = new Day_01(1975,03,12);
        Human_03 gildong = new Human_03("길동", 170, 60, d1);
        Day_01 d2 = new Day_01(1987,10,07);
        Human_03 chulsu = new Human_03("철수", 166, 72, d2);

        System.out.println("gildong = " + gildong);
        System.out.println("chulsu = " + chulsu);
    }
}
