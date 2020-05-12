import java.util.Random;
import java.util.Scanner;

//각 월에 해당하는 영어단어 학습 프로그램
public class Array_15 {
    public static void main(final String[] args) {
        final Random random = new Random();
        final Scanner scanner = new Scanner(System.in);

        final String[] monthStrings = { "January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December" };

        System.out.println("해당 월의 영단어 입력");
        System.out.println("첫글자 대문자, 나머지는 소문자 3글자까지만");
        int retry;
        int last = -1;

        do {
            int month;
            do {
                month = random.nextInt(12);
            } while (month == last);
            last = month;

            while (true) {
                System.out.print((month + 1) + "월 : ");
                final String s = scanner.next();

                if (s.equals(monthStrings[month])) {
                    break;
                } else {
                    System.out.println("틀림");
                }
            }
            System.out.println("정답! 다시한번? yes = 1/no = 0");
            retry = scanner.nextInt();
        } while (retry == 1);
    }
}