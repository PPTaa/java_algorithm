import java.util.Scanner;

//1부터 n까지의 합 구하기(계산식을 표시)
public class Repeat_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        
        System.out.println("1부터 n까지의 합을 구합니다.");
        do {
            System.out.print("n의 값 : ");
            num = scanner.nextInt();
        } while (num <= 0 );

        int sum = 0;
        for (int i = 1; i < num; i++) {
            System.out.print(i+"+");
            sum += i;
        }
        sum += num;
        System.out.println(num+"="+sum);


        
    }
}