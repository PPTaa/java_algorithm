import java.util.Scanner;

//선형 탐색 (가장 끝에 있는 요소를 탐색)
public class Array_8_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("요소수");
        int num = scanner.nextInt();
        int[] a = new int[num];

        for(int j = 0; j<num; j++){
            System.out.println("a["+j+"] :");
            a[j] = scanner.nextInt();
        }
        
        System.out.println("찾을 숫자");
        int findnum = scanner.nextInt();
        //탐색부분
        int i;
        for(i= num - 1; i >= 0; i--){
            if(a[i] == findnum){
                break;
            }
        }
        if(i>=0){
            System.out.println("a["+i+"] : " + findnum);
        } else {
            System.out.println("없음");
            System.out.println(i);
        }
    }
    
}