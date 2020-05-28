import java.util.Scanner;

public class HumanArray {
    
    static void printHumanArray(Human_02[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.printf("No.%d %s %3dcm %3dkg\n",
            i,a[i].getName(),a[i].getHeight(),a[i].getWeight());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        // 1차원 배열
        Human_02[] p = {
            new Human_02("철수",170, 70),
            new Human_02("영희",160, 59),
        };

        System.out.print("배열 q의 요소수:");
        n = scanner.nextInt();

        Human_02[] q = new Human_02[n];
        for (int i = 0; i < q.length; i++) {
            System.out.println("q["+i+"]");
            System.out.print("이름: "); String name = scanner.next();
            System.out.print("신장: "); int height = scanner.nextInt();
            System.out.print("체중: "); int weight = scanner.nextInt();
            q[i] = new Human_02(name, height, weight);
        }
        // 2차원 배열
        Human_02[][] x = {
            {new Human_02("김철수", 175, 52), new Human_02("김영희", 169, 60)},
            {new Human_02("홍길동", 178, 70), new Human_02("이철수", 172, 61)},
            {new Human_02("이영희", 168, 59), new Human_02("김길동", 165, 59)},
        };
        System.out.print("배열 y의 행수:");
        n = scanner.nextInt();
        
        Human_02[][] y = new Human_02[n][];
        for (int i = 0; i < y.length; i++) {
            System.out.println("y["+i+"] 의 열수:");
            n = scanner.nextInt();
            y[i] = new Human_02[n];
            for (int j = 0; j < y[i].length; j++) {
                System.out.println("y["+i+"]["+j+"]");
                System.out.print("이름: "); String name = scanner.next();
                System.out.print("신장: "); int height = scanner.nextInt();
                System.out.print("체중: "); int weight = scanner.nextInt();
                y[i][j] = new Human_02(name, height, weight);
            }
        }

        System.out.println("1차원 배열 p");
        printHumanArray(p);
        System.out.println("1차원 배열 q");
        printHumanArray(q);

        System.out.println("2차원 배열 x");
        for (int i = 0; i < x.length; i++) {
         System.out.printf("%d행\n",i);
         printHumanArray(x[i]);   
        }
        System.out.println("2차원 배열 y");
        for (int i = 0; i < y.length; i++) {
         System.out.printf("%d행\n",i);
         printHumanArray(y[i]);   
        }
    }
}