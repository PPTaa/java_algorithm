import java.util.Scanner;

//2의 거듭제곱과 시프트 연산의 일치성확인
public class Method_11 {
    
    static int pow2(int n) {
        int pw = 1;
        while (n-- > 0) {
            pw *= 2;
        }
        return pw;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수x를 n비트 시프트 합니다.");
        System.out.print("x:");
        int x = scanner.nextInt();
        System.out.print("n:");
        int n = scanner.nextInt();

        int mPower = x * pow2(n);
        int dPower = x / pow2(n);
        int lShift = x << n;
        int rShift = x >> n;

        System.out.printf("[a]X x (2의 3승) = %d\n",mPower);
        System.out.printf("[b]X / (2의 3승) = %d\n",dPower);
        System.out.printf("[c]X << 3 = %d\n",lShift);
        System.out.printf("[d]X >> 3 = %d\n",rShift);

        System.out.printf("a 와 c의 값이 일치"+((mPower == lShift) ? "합니다":"하지않습니다."));



    }

}