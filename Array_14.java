import java.util.Random;
import java.util.Scanner;

//배열의 모든 요소를 역순으로 복사해서 표시
public class Array_14 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("요소수");
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for(int i = 0; i<n; i++){
            a[i]=random.nextInt(100)+1;
            System.out.println("a["+i+"]=" + a[i]);
        }
        //역순으로 복사
        for(int i = 0; i<n; i++){
            b[i] = a[n-1-i];
        }

        System.out.println("복사완료");

        for(int i = 0; i<n; i++){
            System.out.println("b["+i+"]=" + b[i]);
        }
    }
}