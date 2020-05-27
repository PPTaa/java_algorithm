import java.util.Scanner;

public class CarTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car k3 = new Car("k3", "서울999-99", 1660, 1500, 3640, 40.0, 35.0, 12.0);
        Car k5 = new Car("k5", "서울999-99", 1660, 1525, 3695, 41.0, 35.0, 12.0);
        
        k3.putSpec();
        k5.putSpec();

        System.out.println("차량 데이터를 입력하세요");
        System.out.print("이 름 : "); String name = scanner.next();
        System.out.print("번 호 : "); String number = scanner.next();
        System.out.print("전 폭 : "); int width = scanner.nextInt();
        System.out.print("전 고 : "); int height = scanner.nextInt();
        System.out.print("전 장 : "); int length = scanner.nextInt();
        System.out.print("탱크용량 : "); double tank = scanner.nextDouble();
        System.out.print("연료량: "); double fuel = scanner.nextDouble();
        System.out.print("연 비 : "); double sfc = scanner.nextDouble();

        Car myCar = new Car(name, number, width, height, length, tank, fuel, sfc);

        while (true) {
            System.out.printf("현재 위치 : (%f,%f)\n",myCar.getX(), myCar.getY());
            System.out.printf("남은 연료 : %f\n",myCar.getFuel());
            System.out.print("이동 하시겠습니까? (No = 0, Yes = 1) : ");
            if (scanner.nextInt() == 0) {
                break;
            }
            System.out.print("x방향으로 이동거리");
            double dx = scanner.nextDouble();
            System.out.print("y방향으로 이동거리");
            double dy = scanner.nextDouble();

            if (!myCar.move(dx, dy)) {
                System.out.println("연료부족");
            }
        }

    }    
}