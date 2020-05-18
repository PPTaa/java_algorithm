import java.util.Scanner;

//읽은 개수 만큼 *표시 (for문)
public class Repeat_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        
        do {
            System.out.print("몇개의 *를 표시할까요? : ");
            num = scanner.nextInt();
        } while (num <= 0 );

        for (int i = 0; i < num; i++) {
            System.out.print("*");
        } 


        
    }
}