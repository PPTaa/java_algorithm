import java.util.Scanner;

//입력한 달의 계절 표시
public class Repeat_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("계절을 찾습니다.");
        int month;
        int retry;
        do {
            do {
                System.out.print("몇 월입니까? : ");
                month = scanner.nextInt();
            } while (month<1 || month>12);

            if (month>=3 && month<=5) {
                System.out.println("봄입니다.");
            } else if (month>=6 && month<=8) {
                System.out.println("여름입니다.");
            } else if (month>=9 && month<=11) {
                System.out.println("가을입니다.");
            } else {
                System.out.println("겨울입니다.");
            }
            do{ 
            System.out.println("다시 하겠습니까? yes=1, no=0");
            retry = scanner.nextInt();
            } while(retry!=0 && retry!=1);
        } while (retry == 1);
        
    }
}