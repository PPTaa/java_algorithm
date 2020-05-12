import java.util.Random;
import java.util.Scanner;

//키보드를 통해 입력받은 값의 +-5 범위에 있는 난수 생성
public class Variable_12 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
    
        int input,ranint;

        System.out.println("정숫값 :");
        input = scanner.nextInt();
        ranint = input+random.nextInt(11)-5;

        System.out.println("입력값의 +-5 범위의 난수를 생성합니다.");
        System.out.println("난수  : "+ ranint);


        
    }    
}