import java.util.GregorianCalendar; // 단일 임포트
import java.util.Random;
import static java.util.GregorianCalendar.*; //온디멘드 정적 임포트

/**
 * Package_01
 */
// 오늘의 운세
public class Package_02 {
    public static void main(String[] args) {
        GregorianCalendar today = new GregorianCalendar();
        int y = today.get(YEAR);
        int m = today.get(MONTH);
        int d = today.get(DATE);
        System.out.printf("오늘은 %d년 %d월 %d일 입니다.\n",y,m,d);

        Random random = new Random();
        int k = random.nextInt(10);
        System.out.print("오늘의 운세는 ");
        switch (k) {
            case 0: System.out.print("대길"); break;
            case 1: case 2: case 3: System.out.print("길"); break;
            case 4: case 5: case 6: System.out.print("중길"); break;
            case 7: case 8: System.out.print("소길"); break;
            case 9: System.out.print("흉"); break;
        }
        System.out.println("입니다.");
    }
    
}