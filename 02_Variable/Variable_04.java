// 3개의 변수 x,y,z의 합과 평균을 표시
public class Variable_04 {
    public static void main(String[] args) {
        int x,y,z;
        int sum;
        double average;

        x = 63;
        y = 18;
        z = 52;

        System.out.printf("x=%d,y=%d,z=%d\n",x,y,z);
        System.out.println("x+y+z = "+(x+y+z));
        System.out.println("xyz의 평균 = "+(x+y+z)/3);

        sum = x+y+z;
        average = sum/3;

        System.out.println("합 = "+sum);
        System.out.println("평균 = "+average);
    }
    
}