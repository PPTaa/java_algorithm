//읽은 두개 값의 차가 10 이하인지를 표시
import java.util.Scanner;

public class Branch_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A : ");
        int A = scanner.nextInt();
        System.out.print("B : ");
        int B = scanner.nextInt();
        //if 문 사용
        int diff = A>B ? A-B : B-A;
        if (diff > 10) {
            System.out.printf("11두 값의 차는 11이상 입니다.\n");
        } else {
            System.out.printf("11두 값의 차는 10이하 입니다.\n");
        }
        //조건 연산자 사용
        // 식1 ? 식2 : 식3  > 식1의값을 평가해서 값이 True면 식2를 채택, False면 식3을 채택1
        System.out.println("22두 값의 차는"+(diff > 10 ? "11이상":"10이하")+"입니다.");
    }
}