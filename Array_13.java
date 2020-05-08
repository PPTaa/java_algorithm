import java.util.Random;
import java.util.Scanner;

//배열의 순서 섞기
public class Array_13 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("요소수");
        int n = scanner.nextInt();
        int[] a = new int[n];

        for(int i = 0; i<n; i++){
            a[i]=random.nextInt(100)+1;
            System.out.println("a["+i+"]=" + a[i]);
        }
        //배열 섞는 알고리즘
        for(int i = 0; i < 2*n; i++ ){
            int idx1 = random.nextInt(n);
            int idx2 = random.nextInt(n);
            int t = a[idx1];
            a[idx1] = a[idx2];
            a[idx2] = t;
        }
        System.out.println("++++++++++++++");
        for(int i = 0; i<n; i++){
            System.out.println("a["+i+"]=" + a[i]);
        }
    }
}