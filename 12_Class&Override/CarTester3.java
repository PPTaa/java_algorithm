public class CarTester3 {
    public static void main(String[] args) {
        Car_01 car1 = new ExCar("name1", 1885, 1490, 5220, 95.0, new Day_01(2018, 11, 3));
        Car_01 car2 = new Car_01("name1", 1885, 1490, 5220, 95.0, new Day_01(2018, 11, 3));
      
        car1.move(10, 10);
        System.out.println(car1.getFuel());
        System.out.println(((ExCar) car1).getTotalMileage());
        System.out.println(car1.getX()+","+car1.getY());



    }
}