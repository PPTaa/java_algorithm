import java.util.Scanner;

//배열의 복사본 작성
public class Method_23 {
    
    static int[] arraySrcIdx(int[] a, int x) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                count++;
            }
        }
        int[] idx = new int[count--];
        for (int i = a.length-1; count >=0; i--) {
            if (a[i]==x) {
                idx[count--] = i;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요소수 :");
        int num1 = scanner.nextInt();
        int[] a = new int[num1];
        for (int i = 0; i < num1; i++) {
            System.out.print("a["+i+"]:");
            a[i] = scanner.nextInt();
        }
        System.out.print("탐색할 값:"); 
        int x = scanner.nextInt();

        int[] idx = arraySrcIdx(a, x);
        
        for (int i = 0; i < idx.length; i++) {
            System.out.println(idx[i]);
        }

    }
}