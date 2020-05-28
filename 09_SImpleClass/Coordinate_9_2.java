public class Coordinate_9_2 {
    private double x;
    private double y;

    public Coordinate_9_2 (double x, double y){
        set(x, y);
    }
    public Coordinate_9_2(){
    }
    public Coordinate_9_2(Coordinate_9_2 c){
        this(c.x,c.y);
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }

    public void set(double x, double y){
        this.x = x;
        this.y = y;
    }
    public boolean equalTo(Coordinate_9_2 c){
        return x == c.x && y== c.y;
    }
    public String toString(){
        return "("+x+","+y+")";
    }
}
