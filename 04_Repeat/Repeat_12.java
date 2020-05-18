import java.util.Scanner;

//양의 정숫값을 0부터 카운트업
public class Repeat_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        
        System.out.println("카운트 업 합니다.");
        do {
            System.out.print("양의 정수값 : ");
            num = scanner.nextInt();
        } while (num <= 0 );

        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }


        
    }
}