import java.util.Scanner;

//지정한 월의 계절을 표시하는 메서드

public class Method_06 {
    
    static void printSeason(int m) {
        switch (m) {
            case 3: case 4: case 5: System.out.print("봄");
                break;
            case 6: case 7: case 8: System.out.print("여름");
                break;
            case 9: case 10: case 11: System.out.print("가을");
                break;
            case 12: case 1: case 2: System.out.print("겨울");
                break;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m;
        do {
            System.out.print("몇 월입니까(1~12):");
            m = scanner.nextInt();
        } while (m<1||m>12);
        System.out.print("해당월의 계절은 ");
        printSeason(m);
        System.out.print("입니다.");
    }
}