import java.util.Scanner;

//선형탐색
public class Method_17 {

    static int linearSearch(int[] a, int key){
        for (int i = 0; i < a.length; i++) {
            if (a[i]==key) {
                return i ;
            }
        }
        return -1;
    }
    static int linearSearchR(int[] a, int key){
        for (int i = a.length-1; i >= 0 ; i--) {
            if (a[i]==key) {
                return i ;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요소수 :");
        int num = scanner.nextInt();

        int[] a = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x["+i+"]:");
            a[i] = scanner.nextInt();
        }
        System.out.print("찾는 값 : ");
        int key = scanner.nextInt();
        if (linearSearch(a, key) == -1) {
            System.out.println("없는 값");
        } else if (linearSearch(a, key) == linearSearchR(a, key)) {
            System.out.println(linearSearch(a, key));
        } else {
            System.out.println(linearSearch(a, key));
            System.out.println(linearSearchR(a, key));
        }
        
        
    }
}