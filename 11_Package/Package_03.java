import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.Math.*;
// 절댓값 제곱근 원의 넓이 구하기
public class Package_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        out.print("실 수 : ");
        double x = scanner.nextDouble();

        out.println("절댓값 "+abs(x));
        out.println("제곱근 "+sqrt(x));
        out.println("원의 넓이 "+PI*x*x);
    }
    
}