import java.util.Scanner;

//배열에 요소를 삽입해서 반환
public class Method_26 {
    
    static int[] arrayInsOf(int[] a, int idx, int x) {
        int[] y = new int[a.length+1];
        int i = 0;
        for (; i < idx; i++) {
            y[i] = a[i];
        }
        y[idx] = x;
        for (; i < a.length; i++) {
            y[i+1] = a[i];
        }
        return y;
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
        System.out.print("삽입할 인덱스:"); 
        int idx = scanner.nextInt();
        System.out.print("삽입할 값:"); 
        int x = scanner.nextInt();

        int[] y = arrayInsOf(a, idx, x);
        for (int i = 0; i < y.length; i++) {
            System.out.println("y["+i+"]:" + y[i]);
        }

    }
}