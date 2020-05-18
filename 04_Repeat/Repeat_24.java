import java.util.Scanner;

//소수 판정
public class Repeat_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num;
        do{
        System.out.print("2 이상의 정숫값 : ");
        num = scanner.nextInt();
        } while (num < 2);

        int sum = 0;
        for (int i = 2; i < num; i++) {
            sum = num % i;
            if (sum == 0) {
                System.out.println("소수가 아닙니다.");
                break;
            }
        }
        if (sum != 0){
            System.out.println("소수입니다.");
        }
    }
}