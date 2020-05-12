import java.util.Random;

//실수의 난수를 생성해서 표시
public class Variable_13 {
    public static void main(String[] args) {
        Random random = new Random();
    
        double a,b,c;

        System.out.println("3개의 난수를 생성");
        
        a=random.nextDouble();
        b=random.nextDouble()*10;
        c=random.nextDouble()*2-1;

        System.out.println("0.0이상 1.0미만  : "+ a);
        System.out.println("0.0이상 10.0미만  : "+ b);
        System.out.println("-1.0이상 1.0미만  : "+ c);
     


        
    }    
}