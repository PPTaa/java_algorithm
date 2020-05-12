import java.util.Scanner;

//삼각형의 넓이를 구해서 표시
public class Variable_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("삼각형의 밑변 : ");
        double width = scanner.nextDouble();
        System.out.println("삼각형의 높이 : ");
        double height = scanner.nextDouble();

        System.out.println("삼각형의 넓이 : "+(width*height/2));
    }    
}