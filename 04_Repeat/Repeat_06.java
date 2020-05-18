import java.util.Scanner;

//지정한 갯수만큼 * 표시
public class Repeat_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("몇개의 *을 표시 할까요?");
        num = scanner.nextInt();
        if(num > 0 ){
            while (num > 0) {
                System.out.print("*");
                num--;    
            }
            System.out.println();
        }
        
    }
}