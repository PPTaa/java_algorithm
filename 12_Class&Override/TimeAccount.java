public class TimeAccount extends Account_01 {

    private long timeBalance;

    TimeAccount(String name, String no, long balance, long timeBalance) {
        super(name, no, balance);
        this.timeBalance = timeBalance;
        // TODO Auto-generated constructor stub
    }

    long getTimeBalance(){
        return timeBalance;
    }

    void cancel (){
        deposit(timeBalance);
        timeBalance = 0;
    }

    
    
}