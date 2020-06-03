public class MinMaxTester {
    public static void main(String[] args) {
        int[] a = {1,3,5,2,6,1,5,63,1,5,63,1};
        int[] b = {2,1,3,2,1,3};
        System.out.println("a 최솟값 : "+MinMax.min(b));
        int[] xmin = MinMax.minIndexArray(b);
        System.out.print("{ ");
        for (int i = 0; i < xmin.length; i++) {
            System.out.print(xmin[i]+" ");
        }
        System.out.println("}");
        System.out.println("a 최댓값 : "+MinMax.max(b));
        System.out.print("{ ");
        int[] xmax = MinMax.maxIndexArray(b);
        for (int i = 0; i < xmax.length; i++) {
            System.out.print(xmax[i]+" ");
        }
        System.out.println("}");

        System.out.println(MinMax.min(3, 4, 1));
        System.out.println(MinMax.max(3, 4, 1));


    }


}