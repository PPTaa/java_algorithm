//읽은 정숫값이 약수인지 판별(등가 연산자)
import java.util.Scanner;

public class Branch_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수값 A : ");
        int A = scanner.nextInt();
        System.out.print("정수값 B : ");
        int B = scanner.nextInt();

        if (A % B == 0) {
            System.out.println("B는 A의 약수입니다.");
        } else {
            System.out.println("B는 A의 약수가 아닙니다.");
        } 
    }
}