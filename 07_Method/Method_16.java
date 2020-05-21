import java.util.Scanner;

//가장 키가 작은 사람의 신장과 가장 마른사람의 체중을 구한다.
public class Method_16 {

    static int minOf(int[] a){
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("사람수 :");
        int num = scanner.nextInt();

        int[] height = new int[num];
        int[] weight = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print(i+1+"번의 신장 = ");
            height[i] = scanner.nextInt();
            System.out.print(i+1+"번의 체중 = ");
            weight[i] = scanner.nextInt();
        }

        System.out.println("가장 키가 작은 사람의 신장 : "+minOf(height));
        System.out.println("가장 마른 사람의 체중 : "+minOf(weight));
        
        
    }
}