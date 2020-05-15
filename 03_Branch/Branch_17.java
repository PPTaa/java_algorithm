import java.util.Scanner;

public class Branch_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 a : ");
        int a = scanner.nextInt();
        System.out.println("정수 b : ");
        int b = scanner.nextInt();

        if (b > a) {
            int t = a;
            a = b;
            b = t;
        }
        System.out.println("변수 a : "+a);
        System.out.println("변수 b : "+b);
    }
}