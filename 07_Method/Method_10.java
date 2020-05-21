import java.util.Random;
import java.util.Scanner;

//암산훈련 (3개의 3자리 정수를 사용한 계산)

public class Method_10 {
    static Scanner scanner = new Scanner(System.in);
    
    static boolean confirmRetry(){
        int cont;
        do {
            System.out.println("다시한번? yes=1/no=0");
            cont = scanner.nextInt();
        } while (cont !=0 && cont != 1);
        return cont == 1;
    }

    public static void main(String[] args) {
        Random random = new Random();
        do {
            int x = random.nextInt(900)+100;
            int y = random.nextInt(900)+100;
            int z = random.nextInt(900)+100;
            int pattern = random.nextInt(4);

            int answer = 0;
            switch (pattern) {
                case 0:
                    answer = x+y+z;
                    break;
                case 1:
                    answer = x+y-z;
                    break;
                case 2:
                    answer = x-y+z;
                    break;
                case 3:
                    answer = x-y-z;
                    break;
            }
            while (true) {
                System.out.print(x+((pattern<2)?"+":"-")+y+((pattern%2 == 0)?"+":"-")+z+"=");
                int k = scanner.nextInt();
                if (k == answer) {
                    break;

                    
                }
                System.out.println("틀림");
            }
        } while (confirmRetry());
            
    }
    

}