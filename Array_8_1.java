import java.util.Scanner;

//선형 탐색 (가장 앞에 있는 요소를 탐색)
public class Array_8_1 {
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
        for(i=0; i<num; i++){
            if(a[i] == findnum){
                break;
            }
        }
        if(i<num){
            System.out.println("a["+i+"] : " + findnum);
        } else {
            System.out.println("없음");
            System.out.println(i);
        }
    }
    
}