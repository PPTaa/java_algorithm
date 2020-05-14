//읽은 정숫값의 대소관계를 표시
import java.util.Scanner;

public class Branch_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수값 A : ");
        int A = scanner.nextInt();
        System.out.print("정수값 B : ");
        int B = scanner.nextInt();

        if (A > B) {
            System.out.println("A가 크다.");
        } else if (A < B) {
            System.out.println("B가 크다.");
        } else {
            System.out.println("A와 B가 같다.");
        }
    }
}