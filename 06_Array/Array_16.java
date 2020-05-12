import java.util.Random;
import java.util.Scanner;

//요일 영어 단어 학습 프로그램
public class Array_16 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String[] korStrings = {"월","화","수","목","금","토","일"};
        String[] engStrings = {"monday", "tuseday", "wednesday","thursday","friday","saturday","sunday"};
        
        System.out.println("요일이름을 영어로 쓰시오");

        int retry;
        int last = -1;
        do {
            int day;
            //바로 전에 나온 요일 나오지 않도록 last에 저장
            do {
                day = random.nextInt(7);
            } while (last == day);
            last = day;
            //요일 판별 무한 와일문 
            while (true) {
                System.out.println(korStrings[day]+"요일: ");
                String s = scanner.next();
                if(s.equals(engStrings[day])){
                    //정답, 재학습여부 retry
                    System.out.println("정답입니다. 다시? yes:1 / no:0");
                    retry = scanner.nextInt();
                    break;
                } else {
                    //오답
                    System.out.println("오답");
                    int action;
                    do {
                        //정답 공개 여부
                        System.out.println("정답확인 : 1 / 재시도 : 0");
                        action = scanner.nextInt();
                    } while (action != 0 && action != 1);
                    if(action == 1){
                        //정답공개후 재시고 여부
                        System.out.println("정답은 " + engStrings[day] + " 입니다.");
                        System.out.println("re? yes : 1 / no : 0");
                        retry = scanner.nextInt();
                        break;
                    }
                }
            }
        } while (retry == 1);
    }
}