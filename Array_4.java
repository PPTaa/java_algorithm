import java.util.Random;
import java.util.Scanner;

public class Array_4 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.println("요소수 : ");
        int n = stdIn.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < a.length; i++){
            a[i] = rand.nextInt(10);
            System.out.println(a[i]);
        }
        for(int i = 10; i>=1; i--){
            for(int j =0; j<n;j++){
                if(a[j]>=i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for(int i = 0; i<2*n; i++){
            System.out.print("-");
        }
            System.out.println();
        
        for(int i =0; i<n; i++){
            System.out.print(i%10 + " ");
        }
            System.out.println();
        
    }
}