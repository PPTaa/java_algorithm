import java.util.Random;
import java.util.Scanner;

//요소가 int형인 배열을 만들로 1~10의 난수 대입
public class Array_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("요소수");
        int num = scanner.nextInt();
        int[] a = new int[num];

        for(int i = 0; i<num; i++){
            a[i] = random.nextInt(10)+1;
            System.out.println("a["+i+"] = " + a[i]);
        }

    }
    
}