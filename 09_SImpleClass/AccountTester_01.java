/**
 * Accounttester_01
 */
public class AccountTester_01 {
    public static void main(String[] args) {
        Day_01 d = new Day_01(2020,05,31);
        Account_02 gildong = new Account_02("길동", "001", 100, d);

        Day_01 p = gildong.getopenDay();
        System.out.println("계좌 개설일:" + p);

        p.set(2010, 01, 01);
        System.out.println("계좌 개설일:" + p);
    }
    
}