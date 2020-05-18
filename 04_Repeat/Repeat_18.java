import java.util.Scanner;

//정숫값의 제곱 표시
public class Repeat_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("정숫값 : ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(i+"의 제곱은"+i*i+"입니다.");
            
        }
        //다른 풀이
        for (int i=1, j=1; i <= num; i++, j=i*i) {
            System.out.println(i+"의 제곱은"+j+"입니다.");
        }
        
    }
}