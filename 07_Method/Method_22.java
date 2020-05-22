import java.util.Scanner;

//배열의 복사본 작성
public class Method_22 {
    
    static int[] arrayClone(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요소수 :");
        int num1 = scanner.nextInt();
        int[] x = new int[num1];
        for (int i = 0; i < num1; i++) {
            System.out.print("x["+i+"]:");
            x[i] = scanner.nextInt();
        }        

        int[] y = arrayClone(x);
        System.out.println("복사완료");
        for (int i = 0; i < y.length; i++) {
            System.out.println("y["+i+"]:"+y[i]);
        }
    }
}