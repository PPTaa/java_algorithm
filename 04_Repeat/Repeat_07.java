import java.util.Scanner;

//지정한 갯수만큼 *와 +를 교대로 표시
public class Repeat_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("몇개를 표시 할까요?");
        num = scanner.nextInt();
        if(num > 0 ){
            int i = 0;
            while (i < num) {
                i++;
                if(i%2 == 0) {
                    System.out.print("+");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        
    }
}