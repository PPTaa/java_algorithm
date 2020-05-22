import java.util.Scanner;

//두 행렬의 합을 구한다.
public class Method_28 {
    
    static int[][] addMatrix(int[][] x, int[][] y){
        int[][] c = new int[x.length][x[0].length];

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                c[i][j] = x[i][j]+y[i][j];
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
        int weight = scanner.nextInt();

        int [][] x = new int[height][weight];
        int [][] y = new int[height][weight];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < weight; j++) {
                System.out.print("a["+i+"]["+j+"]:");
                x[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < weight; j++) {
                System.out.print("b["+i+"]["+j+"]:");
                y[i][j] = scanner.nextInt();
            }
        }
        int[][] c = addMatrix(x, y);
        System.out.println("행렬a");
        printMatrix(x);
        System.out.println("행렬b");
        printMatrix(y);
        System.out.println("행렬c");
        printMatrix(c);
    }
}