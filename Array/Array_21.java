import java.util.Scanner;

//학습단위로 학생수가 다른 학생
public class Array_21 {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("학급수 : ");
        final int classNum = scanner.nextInt();
        final int[][] point = new int[classNum][];
        int totNum = 0;
        System.out.println(point.length);
        for (int i = 0; i < point.length; i++) {
            System.out.printf("\n%d반의 학생수", i + 1);
            final int stuNum = scanner.nextInt();
            point[i] = new int[stuNum];
            totNum += stuNum;
            for(int j =0; j < point[i].length; j++){
                System.out.printf("%d반%d번의 점수 : ",i+1,j+1);
                point[i][j] = scanner.nextInt();
            }
        }

        System.out.println(" 반 | 합계  평균");
        System.out.println("----+--------------");
        int total = 0;
        for(int i = 0; i<point.length; i++){
            int sum = 0;
            for(int j = 0; j < point[i].length; j++){
                sum += point[i][j];
            }
            total += sum;
            System.out.printf("%d반 |%4d%8.1f\n",i+1,sum, (double)sum/point[i].length);
        }
        System.out.println("----+--------------");
        System.out.printf(" 합 |%4d%8.1f\n",total, (double)total/totNum);
    }
}