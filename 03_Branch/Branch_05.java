//읽은 정숫값의 부호(양수/음수/0)를 판정해서 표시
import java.util.Scanner;

public class Branch_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수값 : ");
        int A = scanner.nextInt();

        if (A > 0) {
            System.out.println("값이 양수입니다.");
        } else if (A < 0) {
            System.out.println("값이 음수입니다.");
        } else {
            System.out.println("값이 0입니다.");
        }
    }
}