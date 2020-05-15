import java.util.Scanner;

public class Branch_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 a: ");
        int a = scanner.nextInt();
        System.out.print("정수 b: ");
        int b = scanner.nextInt();

        if (a==b) {
            System.out.println("두 값이 같다.");
        } else {
            int min=0, max=0;
            if (a>b){
                min = b;
                max = a;
            } else {
                min = a;
                max = b;
            }
            System.out.println("큰값: " +max+"\n작은값: "+min);
        }
    }
}
