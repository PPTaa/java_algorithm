//배열에 요소를 삽입해서 반환
public class Method_27 {
    
    static boolean addMatrix(int[][] x, int[][] y, int[][] z){
        if (x.length != y.length || y.length != z.length) {
            return false;
        }
        for (int i = 0; i < x.length; i++) {
            if (x[i].length != y[i].length || y[i].length != z[i].length) {
                return false;
            }
        }
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                z[i][j] = x[i][j] + y[i][j];
            }
        }
        return true;
    }

    static void printMatrix(int[][] x){
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + "/");
                
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] x = {{1,2,3},{4,5,6}};
        int[][] y = {{6,3,4},{5,1,2}};
        int[][] z = new int[2][3];

        if(addMatrix(x, y, z)) {
            System.out.println("행렬 a");
            printMatrix(x);
            System.out.println("행렬 b");
            printMatrix(y);
            System.out.println("행렬 c");
            printMatrix(z);
        }

    }
}