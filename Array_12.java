import java.util.Random;
import java.util.Scanner;

//배열의 모든요소를 1~10의 난수로 채울것(모든요소가 중복되서는 안된다)
public class Array_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int n;
        do {
            System.out.println("요소수");
            n = scanner.nextInt();    
        } while (n>10);
        
        int[] a = new int[n];

        for(int i = 0; i<n; i++){
            int j;
            do {
                j=0;
                a[i] = random.nextInt(10)+1;
                for(; j<i; j++){
                    if(a[j] == a[i]){
                        break;
                    }
                }
            } while (j<i);
        }
        for(int i = 0; i<n; i++){
            System.out.println("a["+i+"] = " + a[i]);
        }
    }   
}