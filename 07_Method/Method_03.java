//3개의 정숫값에서 중간값 구하기
import java.util.Scanner;

public class Method_03 {
    
    static int med(int a, int b, int c) {
        if (a >= b) {
            if (b >= c) {
                return b;
            } else if (c >= a) {
                return a;
            } else { 
                return c;
            }
        } else if (a > c) {
            return a;
        } else if (b > c) {
            return c;
        } else { 
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 a: ");
        int a = scanner.nextInt();
        System.out.print("정수 b: ");
        int b = scanner.nextInt();
        System.out.print("정수 c: ");
        int c = scanner.nextInt();

        int s = med(a,b,c);
        System.out.println("중간값은 "+s+"입니다.");
    }
}