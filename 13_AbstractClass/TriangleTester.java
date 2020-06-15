import java.util.Scanner;

public class TriangleTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("삼각형의 개수 : ");
        int no = scanner.nextInt();
        Shape[] p = new AbsTriangle[no];

        for (int i = 0; i < no; i++) {
            int type;
            int len;
            do {
                System.out.println("번 삼각형의 종류 (1:좌하/ 2:좌상/ 3:우하/ 4:우상)");
                type = scanner.nextInt();
            } while (type<1||type>4);
            
            System.out.println("길이 : ");
            len = scanner.nextInt();
            p[i] = (type == 1) ? new TriangleLB(len) :
                    (type ==2) ? new TriangleLU(len) :
                    (type ==3) ? new TriangleRB(len) :
                    new TriangleRU(len);
        }     
        for (Shape s : p){
            s.print();
            System.out.println();
        }
    }
}