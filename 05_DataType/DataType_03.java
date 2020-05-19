import java.util.Scanner;

//10진수를 읽어서 8진수 16진수로 표시
public class DataType_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("변수 x는 float형입니다. 변수 y는 double형입니다.");
        System.out.print("변수 x : ");
        Float x = scanner.nextFloat();
        System.out.print("변수 y : ");
        Double y = scanner.nextDouble();

        System.out.println("x : "+ x);
        System.out.println("y : "+ y);
    }
}