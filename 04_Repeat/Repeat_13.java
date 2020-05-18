import java.util.Scanner;

//1부터 n까지의 합 구하기
public class Repeat_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        
        System.out.println("1부터 n까지의 합을 구합니다.");
        do {
            System.out.print("n의 값 : ");
            num = scanner.nextInt();
        } while (num <= 0 );

        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        System.out.println("1부터"+num+"까지의 합은"+sum+"입니다.");


        
    }
}