import java.util.Scanner;

//키보드에서 입력한 정수값에 10을 더하거나 뺀 값 표시
public class Variable_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 입력해 : ");
        int x = scanner.nextInt();

        System.out.println("입력값 + 10 은 : "+(x+10));
        System.out.println("입력값 - 10 은 : "+(x-10));
    }    
}