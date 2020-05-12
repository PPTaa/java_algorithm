import java.util.Scanner;

//키보드에서 입력한 정수값에 마지막 자릿수를 제외한 값과 마지막 자릿수를 표시
public class Variable_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 입력해 : ");
        int x = scanner.nextInt();

        System.out.println("입력값의 마지막 자릿수를 제외한 값은 : "+(x/10));
        System.out.println("입력값의 마지막 자릿수는 : "+(x%10)); // x%y =  x를 y로 나누었을 떄의 나머지를 구하는 연산
    }    
}