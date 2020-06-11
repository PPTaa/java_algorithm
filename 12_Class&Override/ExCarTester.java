public class ExCarTester {
    public static void main(String[] args) {
        ExCar car = new ExCar("asddd", 1845, 1490, 5205, 90.0, new Day_01(2015, 12, 24));

        System.out.printf("현재위치 : (%.2f, %.2f)\n", car.getX(), car.getY());
        System.out.printf("남은 연료 : %.2f \n", car.getFuel());
        System.out.println("구입일 : " + car.getPurchaseDay());
    }
}