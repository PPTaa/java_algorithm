import java.util.Scanner;

//두 값의 최솟값, 세값의 최솟값, 배열요소의 최솟값을 구하는 메서드 (다중정의)
public class Method_30 {
    
    static int min(int a, int b){
        return a>b ? b:a; 
    }
    static int min(int a, int b, int c){
        int min = a;
        if (min>b){
            min = b;
        }
        if (min>c){
            min = c;
        }
        return min;
    }
    static int min(int[] a){
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if(min>a[i]){
                min=a[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x값 :");
        int x = scanner.nextInt();
        System.out.print("y값 :");
        int y = scanner.nextInt();
        System.out.print("z값 :");
        int z = scanner.nextInt();

        System.out.print("배열 a의요소 수:");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("a["+i+"]:");
            a[i] = scanner.nextInt();
        }

        System.out.println("xy의 최솟값 : "+min(x, y));
        System.out.println("xyz의 최솟값 : "+min(x, y, z));
        System.out.println("배열 a의 최솟값 : "+min(a));
    }
}