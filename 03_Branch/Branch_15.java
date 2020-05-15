//3개의 정수중 중앙값 구하기
import java.util.Scanner;

public class Branch_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A : ");
        int a = scanner.nextInt();
        System.out.print("B : ");
        int b = scanner.nextInt();
        System.out.print("C : ");
        int c = scanner.nextInt();
        
        int med;
        if (a > b) {
            if (b>c) {
                med = b;
            } else if (c>a) {
                med = a;
            } else { 
                med = c;
            }
        } else if (a > c) {
            med = a;
        } else if (b > c ) {
            med = c;
        } else {
            med = b;
        }
        System.out.println("중앙값은 " + med + "입니다.");
    }
}