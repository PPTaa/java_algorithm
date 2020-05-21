import java.util.Scanner;

//배열의 요소 삭제
public class Method_18 {

    static void aryRmv(int[] a, int idx) {
        if (idx >= 0 && idx < a.length) {
            for (int i = idx; i < a.length-1; i++) {
                a[i] = a[i+1];
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

        aryRmv(a, idx);
        for (int i = 0; i < num; i++) {
            System.out.println("a["+i+"]=" + a[i]);
        }
        
    }
}