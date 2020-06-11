public class CarTester1 {
    public static void main(String[] args) {
        Car_01 car1 = new Car_01("name1", 1885, 1490, 5220, 95.0, new Day_01(2018, 11, 3));
        ExCar car2 = new ExCar("name2", 2000, 3000, 4000, 200.0, new Day_01(2070, 1, 1));

        Car_01 x;
        x = car1;
        System.out.println(x.getPurchaseDay());
        x = car2;
        System.out.println(x.getPurchaseDay());
        
        ExCar y;
        // y = car1;
        y = car2;
        System.out.println(y.getPurchaseDay());
        System.out.println(y.getTotalMileage());
        


    }
}