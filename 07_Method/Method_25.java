import java.util.Scanner;

//배열에서 연속되는 n개의 요소를 삭제한 배열 반환
public class Method_25 {
    
    static int[] arrayRmvOfN(int[] a, int idx, int n) {
        if (idx < 0 || n < 0 || idx > a.length) {
            return a.clone();
        } else {
            if(idx + n > a.length) {
                n = a.length - idx;
            }
            int[] y = new int[a.length-n];
            int i = 0;
            for (; i < idx; i++) {
                y[i] = a[i];
            }
            for(; i<a.length-n; i++) {
                y[i] = a[i+n];
            }
            return y;
        }
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
        System.out.print("삭제를 시작할 인덱스:"); 
        int idx = scanner.nextInt();
        System.out.print("삭제할 요소의 개수:"); 
        int n = scanner.nextInt();

        int[] y = arrayRmvOfN(a, idx, n);
        for (int i = 0; i < y.length; i++) {
            System.out.println("y["+i+"]:"+y[i]);
        }

    }
}