public class TriangleRU extends AbsTriangle {

    public TriangleRU(int length) {
        super(length);
    }

    public String toString (){
        return "TriangleRU(length: "+getLength()+")";
    }

    @Override
    public void draw() {
        for (int i = getLength(); i > 0 ; i--) {
            for (int j = 0; j < getLength()-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }
    
}