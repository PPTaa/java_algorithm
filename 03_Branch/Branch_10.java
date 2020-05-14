//점수를 기준으로 성적 판정(방법1 : 논리곱 연산자 &&를 이용)
import java.util.Scanner;

public class Branch_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A 점수 : ");
        int scorea = scanner.nextInt();
        System.out.print("B 점수 : ");
        int scoreb = scanner.nextInt();
       
        //점수를 기준으로 성적 판정(방법1 : 논리곱 연산자 &&를 이용)
        if (scorea <= 100 && scorea >= 80) {
            System.out.println("수");
        } else if (scorea <= 79 && scorea >= 70) {
            System.out.println("우");
        } else if (scorea <= 69 && scorea >= 60) {
            System.out.println("미");
        } else if (scorea <= 59 && scorea >= 50) {
            System.out.println("양");
        } else if (scorea <= 49 ) {
            System.out.println("가");
        } else {
            System.out.println("잘못된 점수 입니다.");
        }

        //점수를 기준으로 성적 판정(방법1 : 논리곱 연산자 &&를 이용)
        if (scoreb > 100 || scoreb < 0) {
            System.out.println("잘못된 점수 입니다.");
        } else if (scoreb > 79) {
            System.out.println("수");
        } else if (scoreb > 69) {
            System.out.println("우");
        } else if (scoreb > 59) {
            System.out.println("미");
        } else if (scoreb > 49) {
            System.out.println("양");
        } else {
            System.out.println("가");
        } 
    }
}