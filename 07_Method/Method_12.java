import java.util.Scanner;

//정수를 좌우로 회전한 비트를 표시
public class Method_12 {
    
    static void printBits(int n) {
        for (int i = 31; i >= 0; i--) {
            System.out.print(((n >>> i&1 ) == 1)? "1":"0");
        }
    }
    static int rRotate(int x, int n) {
        if (n < 0) {
            return lRotate(x,-n);
        }
        n %= 32;
        return (n == 0 ? x:(x>>>n)|(x<<(32-n)));
    }
    static int lRotate(int x, int n) {
        if (n < 0) {
            return rRotate(x,-n);
        }
        n %= 32;
        return (n == 0 ? x:(x << n)|(x >>> (32-n)));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x :");
        int x = scanner.nextInt();
        System.out.print("n :");
        int n = scanner.nextInt();

        System.out.print("회전 전 :"); 
        printBits(x);
        System.out.print("\n오른쪽 회전 :");
        printBits(rRotate(x, n));;
        System.out.print("\n왼쪽회전 :");
        printBits(lRotate(x, n));

    }

}