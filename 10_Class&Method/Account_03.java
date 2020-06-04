public class Account_03 {
    private static int counter = 0;

    private String name;
    private String no;
    private long balance;
    private Day openDay;
    private int id;

    {
        id = ++counter;
        System.out.println("계좌생성완료");
    }

    public Account_03 (String name, String no){
        this(name, no, 0, new Day());
    }

    public Account_03 (String name, String no, long balance, Day openDay) {
        this.name = name;
        this.no = no;
        this.balance = balance;
        this.openDay = new Day(openDay);
    }

    public String getName() {
        return this.name;
    }

    public String getNo() {
        return this.no;
    }

    public long getBalance() {
        return this.balance;
    }

    public Day getOpenDay() {
        return this.openDay;
    }

    public int getId() {
        return this.id;
    }
    // 입금
    void deposit(long k) {
        balance += k;
    }
    // 출금
    void withdraw(long k) {
        balance -= k;
    }

    public String toString(){
        return "{"+name+":"+no+","+balance+"}";
    }
}