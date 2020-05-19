import java.util.Scanner;

//3개의 정숫값을 읽어서 평균을 실수로 표시
public class DataType_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정숫값 x,y,z의 평균을 구합니다.");
        System.out.print("x = ");
        int x = scanner.nextInt();
        System.out.print("y = ");
        int y = scanner.nextInt();
        System.out.print("z = ");
        int z = scanner.nextInt();

        //방법1
        double avg1 = (x+y+z)/3;
        System.out.printf("x,y,z의 평균은 %.3f입니다.",avg1);
        //방법2
        double avg2 = (x+y+z)/3.0;
        System.out.printf("x,y,z의 평균은 %.3f입니다.",avg2);

    }
}