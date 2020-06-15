public class TriangleRB extends AbsTriangle {

    public TriangleRB(int length) {
        super(length);
    }

    public String toString (){
        return "TriangleRB(length: "+getLength()+")";
    }

    @Override
    public void draw() {
        for (int i = 1; i <= getLength(); i++) {
            for (int j = 1; j <= getLength()-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }
    
}