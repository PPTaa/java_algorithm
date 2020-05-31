public class PeriodTester {
    public static void main(String[] args) {
        Period taejo = new Period(new Day_01(1392,8,05), new Day_01(1398, 10, 14));
        Period jeongjong = new Period(new Day_01(1398,10,14), new Day_01(1400, 11, 28));
        Period taejong = new Period(new Day_01(1400,11,28), new Day_01(1418, 9, 9));
        Period sejong = new Period(new Day_01(1418,9,9), new Day_01(1450, 3, 30));

        System.out.println("태조 = " + taejo);
        System.out.println("정종 = " + jeongjong);
        System.out.println("태종 = " + taejong);
        System.out.println("세종 = " + sejong);
    }
}
