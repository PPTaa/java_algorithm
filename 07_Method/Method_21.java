import java.util.Scanner;

//두 배열의 전체 요소값을 교환
public class Method_21 {
    //내풀이
    static void aryExchng (int[] a, int[] b) {
        if (a.length > b.length) {
            for (int i = 0; i < b.length; i++) {
                int tmp = a[i];
                a[i]=b[i];
                b[i]=tmp;
            }
        } else {
            for (int i = 0; i < a.length; i++) {
                int tmp = a[i];
                a[i]=b[i];
                b[i]=tmp;
            }
        } 
    }
    //교재 풀이
    static void aryExchng0(int[] a, int[] b) {
        int n = a.length < b.length ? a.length:b.length;
        for (int i = 0; i < n; i++) {
            int tmp = a[i];
            a[i]=b[i];
            b[i]=tmp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("배열 a의 요소수 :");
        int num1 = scanner.nextInt();
        int[] a = new int[num1];
        for (int i = 0; i < num1; i++) {
            System.out.print("a["+i+"]:");
            a[i] = scanner.nextInt();
        }

        System.out.print("배열 b의 요소수 :");
        int num2 = scanner.nextInt();
        int[] b = new int[num2];
        for (int i = 0; i < num2; i++) {
            System.out.print("b["+i+"]:");
            b[i] = scanner.nextInt();
        }

        aryExchng(a, b);
        System.out.println("교환완료");
        for (int i = 0; i < a.length; i++) {
            System.out.println("a["+i+"]:"+a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println("b["+i+"]:"+b[i]);
        }
        
    }
}