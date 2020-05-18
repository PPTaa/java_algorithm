import java.util.Scanner;

//정숫값을 그룹별로 읽어서 합산(정수 5개 X 10개 그룹)
public class Repeat_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        System.out.println("정수를 더합니다.");
        Outer:
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d그룹\n",i);

                for (int j = 0; j < 5; j++) {
                    System.out.print("정수 : ");
                    int num = scanner.nextInt();

                    if (num == 88888) {
                        continue Outer;
                    } else if (num == 99999){
                        break Outer;
                    }
                    sum += num;
                }
            }
        
        System.out.println("합계는 "+sum+"입니다.");
    }
}