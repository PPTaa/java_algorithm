import java.util.Scanner;

//n의 자승 구하기
public class Repeat_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        
        do {
            System.out.print("양의 정숫값 : ");
            num = scanner.nextInt();
        } while (num <= 0 );

        int factorial = 1;
        int i = 1;
        while (i < num) {
            factorial *= i+1;
            i++;
            System.out.println(factorial);

        }
        System.out.println("1부터"+num+"까지의 곱은 " +factorial+"입니다.");

        
    }
}