//읽은 두개의 정수값의 차를 표시
import java.util.Scanner;

public class Branch_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A : ");
        int A = scanner.nextInt();
        System.out.print("B : ");
        int B = scanner.nextInt();
        //if 문 사용
        int minus;
        if (A > B) {
           minus = A-B;
        } else {
            minus = B-A;
        }
        System.out.printf("11두 값의 차는 %d 입니다.\n",minus);
        //조건 연산자 사용
        // 식1 ? 식2 : 식3  > 식1의값을 평가해서 값이 True면 식2를 채택, False면 식3을 채택
        minus = A > B ? A-B : B-A;
        System.out.printf("22두 값의 차는 %d 입니다.",minus);
    }
}