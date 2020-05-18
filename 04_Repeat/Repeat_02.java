import java.util.Scanner;

//3자리의 양의 정숫값 읽기
public class Repeat_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.print("세자리의 정숫값 : ");
            num = scanner.nextInt(); 
        } while (num < 100 || num > 999);
        System.out.println("입력한 값은"+ num + "입니다");
    }
}