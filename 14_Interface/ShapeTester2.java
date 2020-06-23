public class ShapeTester2 {
    public static void main(String[] args) {
        Plane2D[] a = {
            new Rectangle2(2, 5),
            new Parallelogram(2, 5)
        };
        Shape[] b = {
            new Rectangle2(5, 6),
            new Parallelogram(4, 6)
        }; 



        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].getArea());
            System.out.println(a[i].toString());
        }

        for (int i = 0; i < b.length; i++) {
            b[i].draw();
        }
    }
}