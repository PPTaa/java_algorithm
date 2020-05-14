import java.util.Scanner;

public class Branch_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수값 : ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("이 값은 음의 값입니다.");
        } 
    }
}