public class ExCar extends Car_01 {
    private double totalMileage;

    public ExCar(String name, int width, int height, int length, double fuel, Day_01 purchaseDay) {
        super(name, width, height, length, fuel, purchaseDay);
        totalMileage = 0.0;
    }

    public double getTotalMileage(){
        return totalMileage;        
    }
    @Override
    public void putSpec(){
        super.putSpec();
        System.out.printf("총 주행거리 : %.2f KM\n", totalMileage);
    }
    public boolean move(double dx, double dy){
        double dist = Math.sqrt(dx*dx+dy*dy);
        if (!super.move(dx,dy)) {
            return false;
        } else {
            totalMileage += dist;
            return true;
        }

    }
}