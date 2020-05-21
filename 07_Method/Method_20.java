import java.util.Scanner;

//배열에 요소 삽입하기
public class Method_20 {

    static void aryIns(int[] a, int idx, int x) {
        if(idx>=0 && idx<a.length) {
            for (int i = a.length-1; i >idx ; i--) {
                a[i] = a[i-1];
            }
            a[idx] = x;
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
        System.out.print("삽입할 요소의 인덱스 : ");
        int idx = scanner.nextInt();
        System.out.print("삽입할 값 : ");
        int x = scanner.nextInt();

        aryIns(a, idx,x);
        for (int i = 0; i < num; i++) {
            System.out.println("a["+i+"]=" + a[i]);
        }
        
    }
}