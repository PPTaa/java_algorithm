public class Array_3 {
    public static void main(String[] args) {
        double[] a = new double[5];
        for(int i = 0; i<a.length;i++){
            a[i] = 1.1 * (i+1);
        }
        for(int i = 0; i<a.length; i++){
            System.out.println("a["+i+"] :" + a[i]);
        }

    }
}