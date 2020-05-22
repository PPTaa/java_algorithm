import java.util.Scanner;

//정수 및 실수의 절댓값을 구하는 메서드(다중정의)
public class Method_31 {
    
    static int absolute(int x){
        return x>=0?x:-x; 
    }
    static long absolute(long x){
        return x>=0?x:-x; 
    }
    static float absolute(float x){
        return x>=0?x:-x; 
    }
    static double absolute(double x){
        return x>=0?x:-x;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("int a값 :");
        int a = scanner.nextInt();
        System.out.print("long b값 :");
        long b = scanner.nextLong();
        System.out.print("float c값 :");
        float c = scanner.nextFloat();
        System.out.print("double d값 :");
        double d = scanner.nextDouble();


        System.out.println("a의 절댓값 : "+absolute(a));
        System.out.println("b의 절댓값 : "+absolute(b));
        System.out.println("c의 절댓값 : "+absolute(c));
        System.out.println("d의 절댓값 : "+absolute(d));
    }
}