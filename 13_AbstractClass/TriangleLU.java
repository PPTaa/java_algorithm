public class TriangleLU extends AbsTriangle {

    public TriangleLU(int length) {
        super(length);
    }

    public String toString (){
        return "TriangleLU(length: "+getLength()+")";
    }

    @Override
    public void draw() {
        for (int i = getLength(); i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }
    
}