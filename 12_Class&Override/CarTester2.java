public class CarTester2 {
    public static void main(String[] args) {
        Car_01 car1 = new ExCar("name1", 1885, 1490, 5220, 95.0, new Day_01(2018, 11, 3));
        Car_01 car2 = new Car_01("name1", 1885, 1490, 5220, 95.0, new Day_01(2018, 11, 3));
      
        car1.putSpec();
        car2.putSpec();



    }
}