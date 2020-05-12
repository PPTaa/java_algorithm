import java.util.Scanner;

// 주소를 읽어서 표시
public class Variable_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("주소 : ");
        String address = scanner.nextLine();

        
        System.out.print("주소는 "+ address + "입니다.");
    }

}