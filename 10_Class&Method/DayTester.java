import java.util.Scanner;

public class DayTester {
    static Scanner scanner = new Scanner(System.in);
    // 날짜관련 정보 표시
    static void display(Day day){
        System.out.println(day+"에 관한 정보");
        System.out.println("윤년"+(day.isLeap()?"입니다.":"아닙니다."));
        System.out.println("연도내 경과일수"+day.dayOfYear());
        System.out.println("연도내 잔여일수"+day.leftDayOfYear());
    }
    // 날짜 변경
    static void change(Day day){
        System.out.println("[1] 연월일을 변경");
        System.out.println("[2] 연을 변경");
        System.out.println("[3] 월을 변경");
        System.out.println("[4] 일을 변경");
        System.out.println("[5] 1일 뒤로 변경");
        System.out.println("[6] 1일 앞으로 변경");
        System.out.println("[7] n일 뒤로 변경");
        System.out.println("[8] n일 앞으로 변경");
        int change = scanner.nextInt();
        int y=0,m=0,d=0,n=0;
        if (change == 1 || change == 2) {
            System.out.println("연 : ");
            y = scanner.nextInt();
        }
        if (change == 1 || change == 3) {
            System.out.println("월 : ");
            m = scanner.nextInt();
        }
        if (change == 1 || change == 4) {
            System.out.println("일 : ");
            d = scanner.nextInt();
        }
        if (change == 7 || change == 8) {
            System.out.println("몇일 : ");
            n = scanner.nextInt();
        }
        switch (change) {
            case 1: day.set(y, m, d); break;
            case 2: day.setYear(y); break;
            case 3: day.setMonth(m); break;
            case 4: day.setDate(d); break;
            case 5: day.succeed(); break;
            case 6: day.precede(); break;
            case 7: day.succeedDays(n); break;
            case 8: day.precedeDays(n); break;
        }
        System.out.println(day+"로 변경되었습니다. ");
    }
    // 다른날짜와 비교
    static void compare(Day day){
        System.out.println("비교 날짜를 입력하세요");
        System.out.println("연"); int y = scanner.nextInt();
        System.out.println("월"); int m = scanner.nextInt();
        System.out.println("일"); int d = scanner.nextInt();
        Day d2 = new Day(y,m,d);

        int comp = day.compareTo(d2);
        System.out.println(day);
        switch (comp) {
            case -1: System.out.println("가 앞"); break;
            case 1: System.out.println("가 뒤"); break;
            case 0: System.out.println("가 같음"); break;
        }
    }
    // 전후 날짜
    static void beforeAfter(Day day){
        System.out.println("[1] 내일");
        System.out.println("[2] 어제");
        System.out.println("[3] n일 후");
        System.out.println("[4] n일 전");
        int type = scanner.nextInt();
        int n = 0;
        if (type == 3|| type == 4) {
            System.out.println("몇일");
            n = scanner.nextInt();
        }
        System.out.print("이날은");
        switch (type) {
            case 1: System.out.print(day.succeedingDay()); break;
            case 2: System.out.print(day.precedingDay()); break;
            case 3: System.out.print(day.after(n)); break;
            case 4: System.out.print(day.before(n)); break;
        }  
        System.out.println("입니다.");
    }

    public static void main(String[] args) {

        System.out.println("날짜를 입력하세요");
        System.out.println("연"); int y = scanner.nextInt();
        System.out.println("월"); int m = scanner.nextInt();
        System.out.println("일"); int d = scanner.nextInt();

        Day day = new Day(y, m, d);

        while (true) {
            System.out.println("[1] 날짜관련 정보 표시");
            System.out.println("[2] 날짜 변경");
            System.out.println("[3] 다른 날짜와 비교");
            System.out.println("[4] 잔후 날짜");
            System.out.println("[5] 종료");
            int menu = scanner.nextInt();
            if (menu == 5) {
                break;
            }
            switch (menu) {
                case 1: display(day); break;
                case 2: change(day); break;
                case 3: compare(day); break;
                case 4: beforeAfter(day); break;
            }
        }
    }
}