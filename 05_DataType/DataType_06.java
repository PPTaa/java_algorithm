import java.util.Scanner;

//세 정수의 평균값 구하기(캐스트 연산자 이용)
public class DataType_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정숫값 x,y,z의 평균을 구합니다.");
        System.out.print("x = ");
        int x = scanner.nextInt();
        System.out.print("y = ");
        int y = scanner.nextInt();
        System.out.print("z = ");
        int z = scanner.nextInt();

        Double avg = (double) (x + y + z) / 3;
        System.out.printf("x,y,z의 평균은 %.3f 입니다.",avg);

    }
}