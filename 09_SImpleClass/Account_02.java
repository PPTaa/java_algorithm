/**
 * Account_02
 */
public class Account_02 {

    private String name;
    private String no;
    private long balance;
    private Day_01 openDay;

    public String getName() {
        return this.name;
    }
    public String getNo() {
        return this.no;
    }
    public long getBalance() {
        return this.balance;
    }
    public Day_01 getopenDay() {
        return new Day_01(openDay);
    }

    public Account_02(String name, String no, long balance, Day_01 openDay){
        this.name = name;
        this.no = no;
        this.balance = balance;
        this.openDay = new Day_01(openDay);
    }
    // k원 입금
    void deposit(long k){
        balance += k;
    }
    //k원 출금
    void withdraw(long k){
        balance -= k;
    }
    public String toString(){
        return "{"+name+","+no+","+balance+"}";
    }
}