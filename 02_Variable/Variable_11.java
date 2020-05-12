import java.util.Random;

//정수의 난수를 생성해서 표시
//프로그램의 첫 부분(클래스 선언 이전)에 둔다
public class Variable_11 {
    public static void main(String[] args) {
        Random random = new Random();

        int a,b,c;
        a = random.nextInt(9)+1;
        b = -(random.nextInt(9)+1);
        c = random.nextInt(90)+10;

        System.out.println("3개의 난수 생성");
        System.out.println("한자리 양의 정수: "+a);
        System.out.println("한자리 음의 정수: "+b);
        System.out.println("두자리 양의 정수: "+c);


        
    }    
}