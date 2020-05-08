import java.util.Scanner;

//double형의 배열의 모든 요소의 합과 평균
public class Array_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("요소수");
        int num = scanner.nextInt();
        double[] a = new double[num];
        double sum = 0;

        for(int i = 0; i < num; i++){
            System.out.println("a["+i+"]:");
            a[i] = scanner.nextDouble();
            sum += a[i];
        }
        System.out.println("요소의 합은 " + sum);
        System.out.println("요소의 평균은 " + sum/num);        
    }
    
}