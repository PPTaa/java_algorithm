import java.util.Scanner;

public class CoordinateTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("좌표 p를 입력");
        System.out.print("x좌표:"); double x = scanner.nextDouble();
        System.out.print("y좌표:"); double y = scanner.nextDouble();

        Coordinate p = new Coordinate(x, y);
        System.out.println("p=("+p.getX()+","+p.getY()+")");
        Coordinate q = p;
        q.set(9.9, 9.9);
        System.out.println("p=("+p.getX()+","+p.getY()+")");
        System.out.println("q=("+q.getX()+","+q.getY()+")");
    }
}
