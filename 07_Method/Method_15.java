import java.util.Scanner;

//배열이 가지는 모든 요소의 합 구하기(기본 for문)
public class Method_15 {

    static int sumOf(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요소수 :");
        int num = scanner.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x["+i+"] :");
            x[i] = scanner.nextInt();
        }
        System.out.println(sumOf(x));
    }
}