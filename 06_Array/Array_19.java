import java.util.Scanner;

//6명의 두과목 (국,수) 점수로부터 과목별 / 학생별 평균구하기
public class Array_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 6;
        int[][] point = new int[number][2];
        int[] sumStudent = new int[number];
        int[] sumsubject = new int[2];

        System.out.printf("%d명의 국어 수학점수를 입력하세요.\n",number);
        for(int i = 0; i<number; i++){
            System.out.printf("%d번 국어 점수 : ",i+1);
            point[i][0] = scanner.nextInt();
            System.out.printf("%d번 수학 점수 : ", i + 1);
            point[i][1] = scanner.nextInt();

            sumStudent[i] = point[i][0] + point[i][1];
            sumsubject[0] += point[i][0];
            sumsubject[1] += point[i][1];
        }
        System.out.println("No.  국어  수학   평균");
        for(int i = 0; i<number; i++){
            System.out.printf("%2d%6d%6d%8.1f\n",i+1, point[i][0], point[i][1], (double)sumStudent[i]/2);
        }
        System.out.printf("평균 :%2.1f%6.1f", (double)sumsubject[0]/number, (double)sumsubject[1]/number);
    }
}