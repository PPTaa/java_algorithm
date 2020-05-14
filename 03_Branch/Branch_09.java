//읽은 정숫값이 양수이면 3으로 나눈 결과를 표시
import java.util.Scanner;

public class Branch_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수값 : ");
        int A = scanner.nextInt();
       

        if (A < 0) {
            System.out.println("음의 정숫값을 입력했습니다.");
        } else if (A % 3 == 0) {
            System.out.println("이 값은 3으로 나누어집니다.");
        } else if (A % 3 == 1) {
            System.out.println("이 값을 3으로 나눈 나머지는 1 입니다.");
        } else {
            System.out.println("이 값을 3으로 나눈 나머지는 2 입니다.");
        }
    }
}