import java.util.Scanner;

public class ShapeTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("도형의 개수: ");
        int no = scanner.nextInt();
        Shape[] p = new Shape[no];

        for (int i = 0; i < no; i++) {
            int type;
            int len;
            do {
                System.out.print(i+1+"번 도형의 종류(1:점/ 2:수평선/ 3:수직선/ 4:사각형) ");
                type = scanner.nextInt();
            } while (type<1 || type>4);

            switch (type) {
                case 1: p[i] = new Point(); 
                        break;
                case 2: System.out.println("길이는? :");
                        len = scanner.nextInt();
                        p[i] = new HorzLine(len); 
                        break;
                case 3: System.out.println("길이는? :");
                        len = scanner.nextInt();
                        p[i] = new VertLine(len); 
                        break;
                case 4: System.out.println("너비는? :");
                        int width = scanner.nextInt();
                        System.out.println("높이는? :");
                        int height = scanner.nextInt();
                        p[i] = new Rectangle(width, height);
                        break;
            }
        }
        for (Shape s : p) {
            s.print();
            System.out.println();
        }
    }
}