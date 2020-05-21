import java.util.Scanner;

//임의의 비트를 조작
public class Method_13 {
    // int형 비트 구성
    static void printBits(int n) {
        for (int i = 31; i >= 0; i--) {
            System.out.print(((n >>> i&1 ) == 1)? "1":"0");
        }
    }

    static int set(int x, int pos) {
        return x|(1 << pos);
    }
    static int reset(int x, int pos) {
        return x&~(1 << pos);
    }
    static int inverse(int x, int pos) {
        return x^(1 << pos);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x :");
        int x = scanner.nextInt();
        System.out.print("pos :");
        int pos = scanner.nextInt();

        System.out.print("x              :"); 
        printBits(x);
        System.out.print("\nset(x,pos)     :");
        printBits(set(x, pos));
        System.out.print("\nreset(x,pos)   :");
        printBits(reset(x, pos));
        System.out.print("\ninverse(x,pos) :");
        printBits(inverse(x, pos));

    }

}