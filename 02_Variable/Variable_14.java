import java.util.Scanner;

// 입력한 성과 이름을 인사
public class Variable_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("성 : ");
        String lastName = scanner.nextLine();
        System.out.print("이름 : ");
        String firstName = scanner.next();

        System.out.println("안녕하세요."+lastName+firstName+"씨.");
        System.out.println(System.getProperty("file.encoding"));

        scanner.close();
    
    }

}