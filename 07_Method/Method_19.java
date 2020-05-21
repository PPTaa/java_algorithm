import java.util.Scanner;

//배열에서 연속된 요소를 삭제
public class Method_19 {

    static void aryRmv(int[] a, int idx, int n) {
        if (idx >= 0 && idx+n < a.length && n>0) {
            int idx2 = idx+n-1;
            if (idx2 > a.length-n-1) {
                idx2 = a.length-n-1;
            }
            for (int i = idx; i <= idx2; i++) {
                a[i] = a[i+n];
            }
        }
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
        System.out.print("삭제할 요소의 인덱스 : ");
        int idx = scanner.nextInt();
        System.out.print("삭제할 요소의 수 : ");
        int n = scanner.nextInt();

        aryRmv(a, idx,n);
        for (int i = 0; i < num; i++) {
            System.out.println("a["+i+"]=" + a[i]);
        }
        
    }
}