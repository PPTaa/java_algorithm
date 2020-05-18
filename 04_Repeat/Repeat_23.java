import java.util.Scanner;

//숫자 피라미드 표시
public class Repeat_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 피라미드를 표시합니다.");
        
        System.out.print("단수는 : ");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i*2-1; j++) {
                System.out.print(i%10);
            }
            System.out.println();
        }
        
    }
}