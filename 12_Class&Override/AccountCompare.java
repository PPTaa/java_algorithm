public class AccountCompare {

    static int compBalance(Account_01 a, Account_01 b){
        long totalBalanceA = a instanceof TimeAccount
            ? ((TimeAccount)a).getBalance() +((TimeAccount)a).getTimeBalance() 
            : a.getBalance();
        long totalBalanceB = b instanceof TimeAccount
            ? ((TimeAccount)b).getBalance() +((TimeAccount)b).getTimeBalance() 
            : b.getBalance();
        if (totalBalanceA > totalBalanceB) {
            return 1;
        } else if (totalBalanceA < totalBalanceB) {
            return -1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Account_01 A = new Account_01("name1", "13213", 500);
        TimeAccount B = new TimeAccount("name2", "0651320", 300, 200);

        System.out.println("1과 2의 예금 잔액 비교결과");
        switch (compBalance(A, B)) {
            case 1: System.out.println("1이 더 많음"); break;
            case 0: System.out.println("둘이 같음"); break;
            case -1: System.out.println("2가 더 많음"); break;
        
        }
    }
}