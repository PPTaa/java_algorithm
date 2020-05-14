import java.util.Scanner;

public class Branch_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수값 : ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.printf("절댓값은 %d입니다.",-num);
        } else {
            System.out.printf("절댓값은 %d입니다.",num);
        } 
    }
}