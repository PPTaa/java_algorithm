//3개의 정숫값에서 최솟값 구하기
import java.util.Scanner;

public class Method_02 {
    
    static int min(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }

        return min;
    }


    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 a: ");
        int a = scanner.nextInt();
        System.out.print("정수 b: ");
        int b = scanner.nextInt();
        System.out.print("정수 c: ");
        int c = scanner.nextInt();

        int s = min(a,b,c);
        System.out.println("최솟값은 "+s+"입니다.");
    }
}