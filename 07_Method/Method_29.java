import java.util.Scanner;

//2차원 배열의 복사본 생성
public class Method_29 {
    
    static int[][] aryClone2(int[][] a){
        int[][] c = new int[a.length][];
        for (int i = 0; i < a.length; i++) {
            c[i] = new int[a[i].length];
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j];
            }
        }
        return c;
    }

    static void printMatrix(int[][] x){
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + "|");
                
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("행렬의 행 수");
        int height = scanner.nextInt();
        System.out.print("행렬의 열 수");
        int width = scanner.nextInt();

        int [][] a = new int[height][width];
        
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("a["+i+"]["+j+"]:");
                a[i][j] = scanner.nextInt();
            }
        }
        int[][] c = aryClone2(a);
        System.out.println("행렬a");
        printMatrix(a);
        System.out.println("행렬c");
        printMatrix(c);
    }
}