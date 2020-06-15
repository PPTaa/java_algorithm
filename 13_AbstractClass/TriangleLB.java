public class TriangleLB extends AbsTriangle {

    public TriangleLB(int length) {
        super(length);
    }

    public String toString (){
        return "TriangleLB(length: "+getLength()+")";
    }

    @Override
    public void draw() {
        for (int i = 1; i <= getLength(); i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }
    
}