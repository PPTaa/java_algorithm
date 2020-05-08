import java.util.Scanner;

public class Array_7 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("사람수 입력");
        int people = stdIn.nextInt();
        int[] point = new int[people];
        
        System.out.println("점수 입력");
        int sum = 0;
        for(int i = 0; i < people; i++){
            System.out.print((i+1)+"번의 점수");
            point[i] = stdIn.nextInt();
            sum += point[i];    
        }

        int max = point[0];
        int min = point[0];
        for(int i = 0; i < people; i++){
            if(point[i]>max){
                max = point[i];
            }
            if(point[i]<min){
                min = point[i];
            }
        }
        System.out.println("합계 : " +sum);
        System.out.println("평균 : " +sum/people);
        System.out.println("최고점 : " +max);
        System.out.println("최저점 : " +min);
    }
    
}