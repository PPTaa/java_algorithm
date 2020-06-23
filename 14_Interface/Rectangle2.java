public class Rectangle2 extends Shape implements Plane2D {

    private int width;
    private int height;

    public Rectangle2 (int width, int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return width *height ;
    }

    @Override
    public String toString() {
        return "Rectangle(width:"+width+", height:"+height+")";
    }

    @Override
    public void draw() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("ㅁ");
            }
            System.out.println();
        }

    }
    
}