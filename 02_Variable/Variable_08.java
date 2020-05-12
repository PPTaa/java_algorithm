import java.util.Scanner;

//키보드에서 입력한 2개의 실수 값의 합과 평균을 구하는 프로그램
public class Variable_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1번 실수를 입력해 : ");
        double x = scanner.nextDouble();
        System.out.println("2번 실수를 입력해 : ");
        double y = scanner.nextDouble();

        System.out.println("두 값의 합 : "+(x+y));
        System.out.println("두 값의 평균 : "+((x+y)/2)); // x%y =  x를 y로 나누었을 떄의 나머지를 구하는 연산
    }    
}