import java.util.Scanner;

//정방형을 표시
public class Repeat_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정방형을 표시합니다.");
        
        System.out.print("단수는 : ");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}