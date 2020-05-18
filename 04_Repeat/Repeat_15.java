import java.util.Scanner;

//신장별 표준체중 대응표 표시
//표준체중 = (신장-100)*0.9
public class Repeat_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("몇 cm부터: ");
        int start = scanner.nextInt();
        System.out.print("몇 cm까지: ");
        int end = scanner.nextInt();
        System.out.print("몇 cm단위: ");
        int step = scanner.nextInt();

        for (int i = start; i <= end; i += step) {
            System.out.println(i+" "+(i-100)*0.9);
            
        }
        
    }
}