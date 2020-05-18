import java.util.Scanner;

//읽은 정숫값들을 합산(1000이 넘지 않은 범위에서 합산)
public class Repeat_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num;
        System.out.println("정수를 더합니다.");
        System.out.print("몇 개를 더할까요?");
        int count = scanner.nextInt();

        int sum = 0;
        int i;

        for (i = 0; i < count; i++) {
            System.out.print("정수 : ");
            num = scanner.nextInt();
            if (sum+num > 1000) {
                System.out.println("합계가 1000을 넘었습니다.");
                System.out.println("마지막 값은 무시합니다.");
                break;
            }
            sum += num;
        }
        System.out.println("합계 : "+sum);
        if (i>0) {
            System.out.println("평균 : "+sum/i);
        }
    }
}