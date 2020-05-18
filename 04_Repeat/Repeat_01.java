import java.util.Scanner;

//읽은 정숫값의 부호를 판정해서 표시(원하는 만큼 반복)
public class Repeat_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int re;
        do {
            System.out.print("정숫값 : ");
            int a = scanner.nextInt();
            if (a > 0 ) {
                System.out.println("이 값은 양수 입니다.");
            } else if ( a< 0) { 
                System.out.println("이 값은 음수 입니다.");
            } else {
                System.out.println("이 값은 0 입니다.");
            }
            System.out.println("다시 한번? yes = 1, no = 0");
            re = scanner.nextInt();
        } while (re == 1);
    }
}