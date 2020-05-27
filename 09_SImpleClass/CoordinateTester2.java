import java.util.Scanner;

public class CoordinateTester2 {
    static boolean compCoordinate(Coordinate c1, Coordinate c2){
        return c1.getX() == c2.getX() && c1.getY() == c2.getY();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x,y;
        System.out.println("좌표 p를 입력");
        System.out.print("x좌표:"); x = scanner.nextDouble();
        System.out.print("y좌표:"); y = scanner.nextDouble();
        Coordinate p = new Coordinate(x, y);

        System.out.println("좌표 q를 입력");
        System.out.print("x좌표:"); x = scanner.nextDouble();
        System.out.print("y좌표:"); y = scanner.nextDouble();
        Coordinate q = new Coordinate(x, y);


        System.out.println((p==q)?"p==q":"p!=q");
        System.out.println(compCoordinate(p, q)? "p와 q가 같습니다.":"p와 q가 다릅니다");
        
    }
}
