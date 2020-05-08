import java.util.Random;
import java.util.Scanner;

//베열의 모든요소를 1~10의 난수로 채우기(인접한 요소가 중복되지 않도록)
public class Array_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("요소수");
        int num = scanner.nextInt();
        int[] a = new int[num];

        a[0] = random.nextInt(10)+1;

        for(int i = 1; i < num; i++ ){
            do {
                a[i] = random.nextInt(10)+1;
            } while (a[i]==a[i-1]);
        }
        for(int i=0; i<num;i++ ){
            System.out.println("a["+i+"] = " + a[i]);
        }

    }
    
}