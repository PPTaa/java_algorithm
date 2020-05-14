//읽은 두개의 실숫 값 중에서 큰 쪽을 표시
import java.util.Scanner;

public class Branch_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A : ");
        Double A = scanner.nextDouble();
        System.out.print("B : ");
        Double B = scanner.nextDouble();
        //if 문 사용
        double max;
        if (A > B) {
            max = A;
        } else {
            max = B;
        }
        System.out.printf("11큰 값은 %10.3f 입니다.\n",max);
        //조건 연산자 사용
        // 식1 ? 식2 : 식3  > 식1의값을 평가해서 값이 True면 식2를 채택, False면 식3을 채택
        max = A > B ? A : B;
        System.out.printf("22큰 값은 %10.3f 입니다.",max);
    }
}