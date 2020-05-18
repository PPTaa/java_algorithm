import java.util.Random;
import java.util.Scanner;

//숫자 맞추기 게임
public class Repeat_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(90)+10;
        int input;

        System.out.println("숫자 맞추기 게임 시작");
        System.out.println("10부터 99사이의 숫자를 맞추세요");
        do {
            System.out.print("어떤숫자?  : ");
            input = scanner.nextInt(); 
            if (input > num) { 
                System.out.println("더 작은 숫자 입니다.");
            } else {
                System.out.println("더 큰 숫자 입니다.");
            }
        } while (input != num);

        System.out.println("정답입니다");
    }
}