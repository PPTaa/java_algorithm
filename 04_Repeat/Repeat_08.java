import java.util.Scanner;

//양의 정숫값을 읽어 자릿수를 표시한다.
public class Repeat_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("양의 정숫값의 자릿수를 표시합니다.");
        
        do {
            System.out.print("양의 정숫값 : ");
            num = scanner.nextInt();
        } while (num <= 0 );

        int digit = 0;
        while (num > 0) {
            System.out.println(num);
            num /= 10;
            System.out.println(num);
            digit++;
        }
        System.out.println("입력한 숫자는 "+digit+" 입니다.");

        
    }
}