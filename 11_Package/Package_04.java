import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;


// 식별번호 클래스
public class Package_04 {
    private static int counter;
    private int id;

    static {
        GregorianCalendar today = new GregorianCalendar();
        int y = today.get(YEAR);
        int m = today.get(MONTH);
        int d = today.get(DATE);
        System.out.printf("오늘은 %d년 %d월 %d일 입니다.\n",y,m,d);
        counter = y*1000000+m*10000+d*100;
    }
    public Package_04 (){
        id = ++counter;
    }
    public int getId(){
        return this.id = id;
    }
    public static void main(String[] args) {
        Package_04 a = new Package_04();
        Package_04 b = new Package_04();
        Package_04 c = new Package_04();
        Package_04 d = new Package_04();

        System.out.println(a.getId());
        System.out.println(b.getId());
        System.out.println(c.getId());
        System.out.println(d.getId());
    }
}