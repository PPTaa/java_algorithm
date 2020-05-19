import java.util.Scanner;

//10진수를 읽어서 8진수 16진수로 표시
public class DataType_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 : ");
        int num = scanner.nextInt();

        System.out.printf("8진수는 %o 입니다.\n", num);
        System.out.printf("10진수는 %d 입니다.\n", num);
        System.out.printf("16진수는 %x 입니다.", num);
    }
}