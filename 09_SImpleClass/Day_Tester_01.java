import java.util.Scanner;

public class Day_Tester_01{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("day 1을 입력하자");
        System.out.print("년");
        int y = scanner.nextInt();
        System.out.print("월");
        int m = scanner.nextInt();
        System.out.print("일");
        int d = scanner.nextInt();

        Day_01 day_01 = new Day_01(y,m,d);
        System.out.println("day_01 = " + day_01);
        
        Day_01 day_02 = new Day_01(day_01);
        System.out.println("복사완");
        System.out.println("day_02 = " + day_02);

        if (day_01.equalTO(day_02)) {
            System.out.println("day_01과 day_02 가 같습니다");
        } else {
            System.out.println("day_01과 day_02 가 다릅니다");   
        }

        Day_01 d1 = new Day_01();
        Day_01 d2 = new Day_01(2017);
        Day_01 d3 = new Day_01(2017,10);
        Day_01 d4 = new Day_01(2017,10,15);

        System.out.println("d1 = "+d1);
        System.out.println("d2 = "+d2);
        System.out.println("d3 = "+d3);
        System.out.println("d4 = "+d4);

        Day_01[] a = new Day_01[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Day_01();
        }
        
        for (int i = 0; i < a.length; i++) {
            System.out.println("a["+i+"] = "+a[i]);
        }
    }
}