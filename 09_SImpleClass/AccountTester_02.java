import java.util.Scanner;

/**
 * Accounttester_01
 */
public class AccountTester_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("계좌 정보를 입력해주세요");
        System.out.print("명의 : ");
        String name = scanner.next();
        System.out.print("번호 : ");
        String no = scanner.next();
        System.out.print("잔고 : ");
        long balance = scanner.nextLong();
        System.out.print("개설 연도 : ");
        int year = scanner.nextInt();
        System.out.print("개설 월 : ");
        int month = scanner.nextInt();
        System.out.print("개설 일 : ");
        int date = scanner.nextInt();

        Day_01 d = new Day_01(year, month, date);
        Account_02 a = new Account_02(name, no, balance, d);

        System.out.println("계좌 기본 정보 : " + a.toString());
        System.out.println("개설일 : " + a.getopenDay().toString());

    }
    
}