import java.util.Scanner;

//임의의 연속되는 비트를 변경
public class Method_14 {
    // int형 비트 구성
    static void printBits(int n) {
        for (int i = 31; i >= 0; i--) {
            System.out.print(((n >>> i&1 ) == 1)? "1":"0");
        }
    }

    static int set(int x, int pos, int n) {
        return x|(~(~0<<n) << pos);
    }
    static int reset(int x, int pos, int n) {
        return x&~(~(~0<<n) << pos);
    }
    static int inverse(int x, int pos, int n) {
        return x^(~(~0<<n) << pos);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x :");
        int x = scanner.nextInt();
        System.out.print("pos :");
        int pos = scanner.nextInt();
        System.out.print("n :");
        int n = scanner.nextInt();

        System.out.print("x              :"); 
        printBits(x);
        System.out.print("\nset(x,pos)     :");
        printBits(set(x, pos, n));
        System.out.print("\nreset(x,pos)   :");
        printBits(reset(x, pos, n));
        System.out.print("\ninverse(x,pos) :");
        printBits(inverse(x, pos, n));

    }

}