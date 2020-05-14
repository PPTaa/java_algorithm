//읽은 정숫값이 양수이면 10의 배수인지 판정해서 표시
import java.util.Scanner;

public class Branch_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수값 : ");
        int A = scanner.nextInt();
       

        if (A < 0) {
            System.out.println("음의 정숫값을 입력했습니다.");
        } else if (A % 10 == 0) {
            System.out.println("이 값은 10의 배수입니다.");
        } else {
            System.out.println("이 값은 10의 배수가 아닙니다.");
        }
    }
}