import java.util.Random;
import java.util.Scanner;
//4행 3열 의 행렬과 3행 4열의 행렬 곱하기
public class Array_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[][] a = new int[4][3];
        int[][] b = new int[3][4];
        int[][] c = new int[4][4];
        
        System.out.println("======a[4][3]======");
        for(int i = 0; i<4; i++){
            for(int j = 0; j<3; j++){
                a[i][j] = random.nextInt(3)+1;
                System.out.println("a["+i+"]["+j+"] : " + a[i][j]);
                // a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("======b[3][4]======");
        for(int i = 0; i<3; i++){
            for(int j = 0; j<4; j++){
                b[i][j] = random.nextInt(4)+1;
                System.out.println("b["+i+"]["+j+"] : " + b[i][j]);
                // b[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                c[i][j] = 0;
                for(int k = 0; k<3; k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("a, b 의 곱");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j<4; j++){
                System.out.printf("%5d",c[i][j]);
            }
            System.out.println();
        }
    }
}