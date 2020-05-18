import java.util.Scanner;

//두 정수 사이의 정수를 작은 것 부터 순서대로 표시
public class Repeat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 A : ");
        int a = scanner.nextInt();
        System.out.println("정수 B : ");
        int b = scanner.nextInt();

        do {
            System.out.print(a+",");
            a += 1;
            // a++;
        } while (a <= b);
        

        System.out.println("정답입니다");
    }
}