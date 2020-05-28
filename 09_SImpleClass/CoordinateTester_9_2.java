import java.util.Scanner;

public class CoordinateTester_9_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x,y;
        System.out.println("좌표 p를 입력");
        System.out.print("x좌표:"); x = scanner.nextDouble();
        System.out.print("y좌표:"); y = scanner.nextDouble();
        Coordinate_9_2 p = new Coordinate_9_2(x, y);

        System.out.println("p = " + p);
        Coordinate_9_2 q = new Coordinate_9_2(p);

        System.out.println("p와q를 동일 좌표로 만들었습니다.");
        System.out.println("q = "+q);
        if (p.equalTo(q)) {
            System.out.println("p와 q가 같습니다.");
        } else {
            System.out.println("p와 q가 다릅니다.");
        }

        Coordinate_9_2 c1 = new Coordinate_9_2();
        Coordinate_9_2 c2 = new Coordinate_9_2(1.1,2.2);

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        Coordinate_9_2[] a = new Coordinate_9_2[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Coordinate_9_2();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("a["+i+"] = " + a[i]);
        }
    }
}
