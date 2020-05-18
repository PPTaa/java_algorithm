import java.util.Scanner;

//읽은 정숫값들을 합산(0이 입력되면 종료)
public class Repeat_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num;
        System.out.println("정수를 더합니다.");
        System.out.print("몇 개를 더할까요?");
        int count = scanner.nextInt();
        int sum = 0;
        int i;
        for (i = 0; i < count; i++) {
            System.out.print("정수(0으로 종료) : ");
            num = scanner.nextInt();
            sum += num;
            if (num == 0) {
                break;
            }
        }
        System.out.println("합계 : "+sum);
        System.out.println("평균 : "+sum/i);
        

    }
}