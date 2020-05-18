import java.util.Random;
import java.util.Scanner;

//숫자 맞추기 게임(0-99)
public class Repeat_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("숫자맞추기 게임 시작");
        System.out.println("0부터 99사이의 숫자를 맞추세요.");
        int num;
        int randint = random.nextInt(100);

        for (int i = 6; i > 0; i--) {
            System.out.print("남은횟수 " + i + "회 어떤숫자일까?");
            num = scanner.nextInt();
            if (randint > num) { 
                System.out.println("더 큰수 입니다.");
            } else if (randint < num) {
                System.out.println("더 작은 수 입니다.");
            } else {
                System.out.println(6-i +"회 만에 맞추었습니다.");
                break;
            }

            if (i == 1) {
                System.out.println("정답은" + randint + "입니다");
            }
            


        }
    }
}