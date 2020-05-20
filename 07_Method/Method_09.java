import java.util.Scanner;

//양의 정숫값을 읽어서 뒤에서 부터 읽어서 표시

public class Method_09 {
    static Scanner scanner = new Scanner(System.in);
    static int readPlusInt() {
        int a;
        do {
            System.out.println("양의 정숫값:");
            a = scanner.nextInt();
        } while(a<=0);
        return a;
    }


    public static void main(String[] args) {
        int re;
        do {
            int a = readPlusInt();
            System.out.print("반대로 읽으면 ");
            while (a > 0) {
                System.out.print(a%10);
                a /= 10;
            }
            System.out.println("입니다.");

            do {
                System.out.println("다시한번? yes=1 / no=0");
                re = scanner.nextInt();
            } while (re != 0 && re != 1);
        } while (re == 1);
        
        
        
    }
    

}