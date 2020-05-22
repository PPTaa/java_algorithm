import java.util.Scanner;

//1차원 배열 2차월 배열 표시
public class Method_33 {
    
    static void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        } System.out.println();
    }
    static void printArray(int[][] a){
        int[][] x = new int[a.length][];
        int max = 0;
        for (int i = 0; i < x.length; i++) {
            x[i] = new int[a[i].length];
            if (a[i].length>max) {
                max = a[i].length;
            }
        }

        int[] maxWidth = new int[max];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                int value = a[i][j];
                x[i][j] = (value < 0) ? 1:0;
                do{
                    x[i][j]++;
                    value /= 10;
                } while (value != 0);
                if (x[i][j] > maxWidth[j]) {
                    maxWidth[j] = x[i][j];
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
                for (int k = 0; k <= maxWidth[j]-x[i][j]; k++) {
                    System.out.print("|");
                }
            }
            System.out.println(a[i][a[i].length-1]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
        System.out.print("1차원 행렬 x의 요소 수 :");
        int n = scanner.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("x["+i+"] : ");
            x[i] = scanner.nextInt();
        }

        System.out.print("2차원 배열 y의 행수 :");
        int height = scanner.nextInt();
        int[][] y = new int[height][];
        for (int i = 0; i < y.length; i++) {
            System.out.print("행째 열 수 :");
            int width = scanner.nextInt();
            y[i] = new int[width];
        }
        System.out.println("각 요소의 값을 입력");
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y[i].length; j++) {
                System.out.println("y["+i+"]["+j+"] : ");
                y[i][j] = scanner.nextInt();
            }
        }

        printArray(x);
        System.out.println("******************");
        printArray(y);



        
    }
}