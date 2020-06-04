import java.util.Scanner;

/**
 * AccountTester_03
 */
public class AccountTester_03 {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("계좌 개설수");
        int n = scanner.nextInt();
        Account_03[] a = new Account_03[n];

        for (int i = 0; i < a.length; i++) {
            System.out.println("0_간이, 1_상세");
            int menu = scanner.nextInt();

            System.out.println("계좌정보 입력");
            System.out.print("명 의 : "); String name = scanner.next();
            System.out.print("번 호 : "); String no = scanner.next();

            if (menu == 0) {
                a[i] = new Account_03(name, no);
            } else {
                System.out.print("잔 고 : "); int balance = scanner.nextInt();
                System.out.print("개설 연도 : "); int y = scanner.nextInt();
                System.out.print("개설 월 : "); int m = scanner.nextInt();
                System.out.print("개설 일 : "); int d = scanner.nextInt();
                a[i] = new Account_03(name, no, balance, new Day(y, m, d));
            }
            System.out.println(a[i]);
            System.out.println(a[i].getId());
            System.out.println(a[i].getOpenDay().toString());
        }

    }
}