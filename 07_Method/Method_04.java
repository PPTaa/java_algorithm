//1부터 n까지의 합 구하기
import java.util.Scanner;

public class Method_04 {
    
    static int sumUp(int x) {
        int sum=0;
        for (int i = 1; i <= x; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        do {
            System.out.print("x의 값: ");
            x = scanner.nextInt();
        } while (x <= 0);

        System.out.println("1부터"+x+"까지의 합은 "+sumUp(x)+"입니다.");
    }
}