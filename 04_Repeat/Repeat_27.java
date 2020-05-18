import java.util.Scanner;

//읽은 정숫값들을 합산(음수는 제외)
public class Repeat_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num;
        System.out.println("정수를 더합니다.");
        System.out.print("몇 개를 더할까요?");
        int count = scanner.nextInt();

        int sum = 0;
        int i;
        int positive=0;//정수들의 개수

        for (i = 0; i < count; i++) {
            System.out.print("정수 : ");
            num = scanner.nextInt();
            if (num < 0) {
                System.out.println("음수는 더하지 않습니다.");
                continue;
            } 
            sum += num;
            positive++;
        }
        System.out.println("합계 : "+sum);
        if (i>0) {
            System.out.println("평균 : "+sum/positive);
        }
    }
}