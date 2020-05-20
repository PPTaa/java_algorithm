import java.util.Random;
import java.util.Scanner;

//지정한 범위의 난수를 생성하는 매서드

public class Method_08 {
    static int random(int a, int b) {
        Random rand = new Random();
        if (a >= b) {
            return a;
        } else {
            return a + rand.nextInt(b-a+1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("난수를 생성합니다.");
        System.out.print("하한값:");
        int a = scanner.nextInt();
        System.out.print("상한값:");
        int b = scanner.nextInt();
        
        System.out.println("생성한 난수는 "+random(a, b)+"입니다.");
    }
    

}