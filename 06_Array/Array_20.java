import java.util.Scanner;

//불규칙적인 2차원 배열
public class Array_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("불규칙한 2차원 배열을 생성합니다.");
        System.out.println("행수");
        int height = scanner.nextInt();

        int[][] a = new int[height][];

        for(int i = 0; i < height; i++){
            System.out.println(i+"행째의 열 수 : ");
            int width = scanner.nextInt();
            a[i] = new int[width];
        }
        System.out.println("각요소의 값을 입력하세요");
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.printf("a[%d][%d] : ",i,j);
                a[i][j] = scanner.nextInt(); 
            }
        }
        System.out.println("배열 a의 요소값입니다.");
        for(int i = 0; i <a.length; i++){
            System.out.print("[");
            for(int j = 0; j < a[i].length; j++){
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println("]");
        }
    }
}