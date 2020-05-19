//0.0부터 1.0까지 0.001씩 증가시키며 표시
public class DataType_08 {
    public static void main(String[] args) {
        
        System.out.println("float       int");
        System.out.println("=================");

        Float x = 0.0f;
        for (int i = 0; i < 1000; i++, x+=0.001F) {
            System.out.printf("%9.7f %9.7f\n",x, (float)i/1000);
        }
    }
}