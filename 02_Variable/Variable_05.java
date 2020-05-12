import java.util.Scanner;

//키보드에서 입력한 정수값 표시
//프로그램의 시작부분(클래스 선언이전)에 작성됨
public class Variable_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 입력해 : ");
        int x = scanner.nextInt();
        System.out.println("입력값은 : "+x);
    }    
}