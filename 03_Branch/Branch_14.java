//3개의 정수중 최솟값 구하기
import java.util.Scanner;

public class Branch_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A : ");
        int a = scanner.nextInt();
        System.out.print("B : ");
        int b = scanner.nextInt();
        System.out.print("C : ");
        int c = scanner.nextInt();
        
        int min = a;
        if(min>b){
            min = b;
        } 
        if(min > c){
            min = c;
        }
        System.out.println("최솟값은 " + min + "입니다.");
    }
}