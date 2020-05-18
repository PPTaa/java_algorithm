import java.util.Scanner;

//읽은 개수만큼 *를 표시 (5개 단위로 줄바꿈)
public class Repeat_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("몇개의 *를 표시할까요? : ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.print("*");
            if (i%5 == 0) {
                System.out.println();
            }
        }System.out.println();

        //다른방법
        for (int i = 0; i < num/5; i++) {
            System.out.println("*****");
        }
        if (num%5 > 0) {
            for (int i = 1; i <= num%5; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}