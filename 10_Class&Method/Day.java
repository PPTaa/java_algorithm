import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

public class Day {
    private int year = 1;
    private int month = 1;
    private int date = 1;

    private static int[][] mdays = {
        {31,28,31,30,31,30,31,31,30,31,30,31}, //평년
        {31,29,31,30,31,30,31,31,30,31,30,31}  //윤년
    };
    // y년은 윤년?
    public static boolean isLeap(int y){
        return y%4 == 0 && y % 100 != 0 || y % 400 == 0; 
    }
    // y년 m월의 일수
    private static int dayOfMonth(int y, int m){
        return mdays[isLeap(y)? 1 : 0][m-1];
    }
    // 조정된 m월
    private static int adjustedMonth(int m){
        return m<1 ? 1 : m>12 ? 12 : m;
    }
    // 조정된 y년 m월의 d일
    private static int adjustDay(int y, int m, int d){
        if(d<1){
            d = 1;
        }
        int dMax = dayOfMonth(y, m);
        return d > dMax ? dMax : d;
    }   
    // 생성자
    public Day(){
        GregorianCalendar today = new GregorianCalendar();
        this.year = today.get(YEAR);
        this.month = today.get(MONTH)+1;
        this.date = today.get(DATE);
    }
    public Day(int year){
        this.year = year;
    }
    public Day(int year,int month){
        this(year);
        this.month = adjustedMonth(month);
    }
    public Day(int year, int month, int date){
        this(year, month);
        this.date = adjustDay(year, month, date);
    }
    public Day(Day d){
        this(d.year, d.month, d.date);
    }
    // 게터
    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDate(){
        return date;
    }
    // 세터
    public void setYear(int year){
        this.year = year;
        this.date = adjustDay(year, month, date);
    }
    public void setMonth(int month){
        this.month = adjustedMonth(month);
        this.date = adjustDay(year, month, date);
    }
    public void setDate(int date){
        this.date = adjustDay(year, month, date);
    }
    public void set(int year, int month, int date){
        this.year = year;
        this.month = adjustedMonth(month);
        this.date = adjustDay(year, month, date);
    }
    // 윤년인지?
    public boolean isLeap(){
        return isLeap(year);
    }
    // 요일 구하기
    public int dayOfWeek(){
        int y = year;
        int m = month;
        if (m==1 || m==2){
            y--;
            m+=12;
        }
        return (y+y/4-y/100+y/400+(13+m+8)/5+date)%7;
    }
    // 날짜 d와 같은가?
    public boolean equalTo(Day d){
        return year == d.year && month==d.month && date == d.date;
    }
    // 문자열 표현 반환
    public String toString(){
        String[] wd = {"일","월","화","수","목","금","토"};
        return String.format("%04d년%02d월%02d일(%s)", year,month,date,wd[dayOfWeek()]);
    }
    // 연내 경과 일수
    public int dayOfYear(){
        int days = date;
        for (int i = 1; i < month; i++) {
            days += dayOfMonth(year, i);
        }
        return days;
    }
    // 연내 잔여일수
    public int leftDayOfYear(){
        return 365 + (isLeap(year)?1:0) - dayOfYear();
    }
    // 날짜 d와의 전후 관계
    public int compareTo(Day d){
        return compare(this, d);
    }
    //두 날짜의 전후관계
    public static int compare(Day d1, Day d2){
        if (d1.year > d2.year) {
            return 1;
        }
        if (d1.year < d2.year) {
            return -1;
        }
        if (d1.month > d2.month) {
            return 1;
        }
        if (d1.month < d2.month) {
            return -1;
        }
        return d1.date > d2.date ? 1 : d1.date < d2.date ? -1 : 0;
    }
    // 날짜를 하루 뒤로 변경
    public void succeed(){
        if (date < dayOfMonth(year, month)) {
            date++;
        } else {
            if (++month > 12) {
                year++;
                month = 1;
            }
            date = 1;
        }
    }
    // 하루뒤 날짜를 반환
    public Day succeedingDay(){
        Day tmp = new Day(this);
        tmp.succeed();
        return tmp;
    }
    // 날짜를 하루 앞으로 변경
    public void precede(){
        if (date > 1) {
            date--;
        } else {
            if (--month < 1) {
                year--;
                month = 12;
            }
            date = dayOfMonth(year, month);
        }
    }
    // 하루앞 날짜를 반환
    public Day precedingDay(){
        Day tmp = new Day(this);
        tmp.precede();
        return tmp;
    }
    // 날짜를 n일 뒤로 변경
    public void succeedDays(int n){
        if (n < 0) {
            precedeDays(-n);
        } else {
            date += n;
            while (date > dayOfMonth(year, month)) {
                date -= dayOfMonth(year, month);
                if (++month > 12) {
                    year++;
                    month = 1;
                }
            }
        }
    }
    // n일 뒤의 날짜를 반환
    public Day after(int n){
        Day tmp = new Day(this);
        tmp.succeedDays(n);
        return tmp;
    }
    // 날짜를 n일 앞으로 변경
    public void precedeDays(int n){
        if (n < 0) {
            succeedDays(-n);
        } else {
            date -= n;
            while (date < 1) {
                if (--month < 1) {
                    year--;
                    month = 12;
                }
                date += dayOfMonth(year, month);
            }
        }
    }
    // n일 앞의 날짜를 반환
    public Day before(int n){
        Day tmp = new Day(this);
        tmp.precedeDays(n);
        return tmp;
    }
}