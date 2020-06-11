public class Car_01 {
    private String name;
    private int width;
    private int height;
    private int length;

    private double x;
    private double y;
    private double fuel;
    private Day_01 purchaseDay;

    Car_01(String name, int width, int height, int length, double fuel, Day_01 purchaseDay){
        this.name = name;
        this.width = width;
        this.height = height;
        this.length = length;
        this.fuel = fuel;
        x=y=0.0;
        this.purchaseDay = new Day_01(purchaseDay);
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getFuel(){
        return fuel;
    }
    public Day_01 getPurchaseDay(){
        return new Day_01(purchaseDay);
    }

    public void putSpec(){
        System.out.println("이름 : " + name);
        System.out.println("전폭 : " + width);
        System.out.println("전고 : " + height);
        System.out.println("전장 : " + length);
    }

    public boolean move(double dx, double dy){
        double dist = Math.sqrt(dx*dx+dy*dy);
        if (dist > fuel) {
            return false;
        } else {
            fuel -= dist;
            x += dx;
            y += dy;
            return true;
        }
    }

}