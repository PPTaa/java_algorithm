import java.util.Scanner;

public class Array_6 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("입력");
        int n = stdIn.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("a["+i+"] : ");
            a[i] = stdIn.nextInt();
        }
        for(int i = 0; i < a.length; i++){
            System.out.println("a["+i+"] : " + a[i]);
        }
        
    }
    
}