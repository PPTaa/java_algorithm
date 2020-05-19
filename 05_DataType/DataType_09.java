//0.0부터 1.0까지 0.001씩 증가시키며 제곱 표시(반복을 float형으로 제어)
public class DataType_09 {
    public static void main(String[] args) {
        
        System.out.println("x           x 제곱");
        System.out.println("===================");

        //(반복을 float형으로 제어)
        Float x=0.0f;
        for (x=0.0f; x <= 1.0f; x+=0.001f) {
            System.out.printf("%5.3f %10.7f\n",x, x*x);
        }
        //(반복을 int형으로 제어)
        for (int i = 0; i <= 1000; i++) {
            Float x2 = (float) (i) / 1000;
            System.out.printf("%5.3f %10.7f\n",x2, x2*x2);
        }
    }
}