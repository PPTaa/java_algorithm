import java.util.Random;

//생성된 난수에 따라서 가위바위보 중에 하나를 표시
public class Branch_19 {
    public static void main(String[] args) {
        Random random = new Random();

        int rsp = random.nextInt(3);

        switch (rsp) {
            case 0:
                System.out.println("가위");
                break;
            case 1:
                System.out.println("바위");
                break;
            case 2:
                System.out.println("보");
                break;
        }
        
    }
}