import java.util.Scanner;

//양의 정숫값을 0까지 카운트다운 (for문)
public class Repeat_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        
        System.out.println("카운트 다운 합니다.");
        do {
            System.out.print("양의 정수값 : ");
            num = scanner.nextInt();
        } while (num <= 0 );

        for (int i = num; i >= 0; i--) {
            System.out.println(i);
        }


        
    }
}