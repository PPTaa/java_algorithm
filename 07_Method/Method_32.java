import java.util.Scanner;

//정수형의 내부 비트를 표시하는 메서드(다중정의)
public class Method_32 {
    
    static void printBits(byte x){
        for (int i = 7; i >= 0; i--) {
            System.out.print(((x >>> i & 1) == 1)? "1":"0");
        }
    }
    static void printBits(short x){
        for (int i = 15; i >= 0; i--) {
            System.out.print(((x >>> i & 1) == 1)? "1":"0");
        }
    }
    static void printBits(int x){
        for (int i = 31; i >= 0; i--) {
            System.out.print(((x >>> i & 1) == 1)? "1":"0");
        }
    }
    static void printBits(long x){
        for (int i = 63; i >= 0; i--) {
            System.out.print(((x >>> i & 1) == 1)? "1":"0");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("byte a값 :");
        byte a = scanner.nextByte();
        System.out.print("short b값 :");
        short b = scanner.nextShort();
        System.out.print("int c값 :");
        int c = scanner.nextInt();
        System.out.print("long d값 :");
        long d = scanner.nextLong();


        System.out.print("a의 비트 : ");printBits(a);
        System.out.print("\nb의 비트 : ");printBits(b);
        System.out.print("\nc의 비트 : ");printBits(c);
        System.out.print("\nd의 비트 : ");printBits(d);
    }
}