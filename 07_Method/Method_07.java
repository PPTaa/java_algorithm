import java.util.Scanner;

//왼쪽아래가 직각인 이등변 삼각형을 표시

public class Method_07 {
    
    static void putChars(String c,int n) {
        while (n-- > 0) {
            System.out.print(c);
        }
    }
    static void putStart(int n) {
        putChars("*", n);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("왼쪽아래가 직각인 이등변 삼각형을 표시");
        System.out.print("단수:");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            putStart(i);
            System.out.println("/");
        }
        
    }
}