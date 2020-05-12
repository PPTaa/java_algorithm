import java.util.Scanner;

//구의 부피와 겉넓이 구하기
public class Variable_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double pi = 3.1416; 
        //final 변수는 값의 대입을 한번만 할 수 있음
        //final 변수를 사용해서 얻는 이점
        //값의 관리를 한곳에서 집중해서 할 수 있다.
        //프로그램의 가독성 향상

        System.out.println("구의 겉넓이와 부피를 구합니다.");
        System.out.println("구의 반지름 : ");
        double r = scanner.nextDouble();

        System.out.println("구의 겉넓이 : "+(4*pi*r*r));
        System.out.println("구의 부피 : "+(4/3.0*pi*r*r*r));

    }    
}