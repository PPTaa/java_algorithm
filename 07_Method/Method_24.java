import java.util.Scanner;

//배열에서 요소를 삭제한 배열을 반환
public class Method_24 {
    
    static int[] arrayRmvOf(int[] a, int idx) {
        int[] y = new int[a.length-1];
        int i=0;
        for (; i < idx; i++) {
            y[i] = a[i];
        }
        for (; i < a.length-1; i++) {
            y[i] = a[i+1];
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
        System.out.print("삭제할 요소의 인덱스:"); 
        int idx = scanner.nextInt();

        int[] y = arrayRmvOf(a, idx);
        for (int i = 0; i < y.length; i++) {
            System.out.println("y["+i+"]:"+y[i]);
        }
    }
}