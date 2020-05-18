import java.util.Scanner;

//입력한 정숫값의 모든 약수 표시
public class Repeat_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("정숫값 : ");
        int num = scanner.nextInt();
        int count=0;

        for (int i = 1; i <= num; i++) {
            if (num%i == 0){
                System.out.print(i+" ");
                count++;
            }
        } 
        System.out.print("\n의 약수는 "+count+"개 입니다.");
        
    }
}