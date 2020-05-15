import java.util.Scanner;

public class Branch_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 a: ");
        int a = scanner.nextInt();
        System.out.print("정수 b: ");
        int b = scanner.nextInt();
        System.out.print("정수 c: ");
        int c = scanner.nextInt();

        if (a > b){
            int tmp=a;
            a = b;
            b = tmp;
        }
        if (b > c){
            int tmp = b;
            b = c;
            c = tmp;
        }
        if (a > b){
            int tmp = a;
            a = b;
            b = tmp;
        }
        System.out.println("a :"+a+"\nb :"+b+"\nc :"+c);
    }
}