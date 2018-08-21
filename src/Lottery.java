import java.util.Random;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int lottery = rd.nextInt(100);

        System.out.println("Nhap vao so dau tien cua so du doan: ");
        int guessDigit1 = sc.nextInt();
        System.out.println("Nhap vao so thu hai cua so du doan: ");
        int guessDigit2 = sc.nextInt();

        if (lottery < 10) {
            if (guessDigit1 == 0 && guessDigit2 == lottery) {
                System.out.println("Ban da trung $10,000");
            } else {
                System.out.println("Chuc ban may man lan sau!");
            }
        }
        if (lottery == (guessDigit1*10 + guessDigit2)) {
            System.out.println("Ban da trung $10,000");
        } else if (lottery == (guessDigit2*10 + guessDigit1)){
            System.out.println("Ban da trung $3,000");
        } else if (lottery%10 == guessDigit1 || lottery/10 == guessDigit1 || lottery%10 == guessDigit2 || lottery/10 == guessDigit2){
            System.out.println("Ban da trung $1,000");
        } else {
            System.out.println("Chuc ban may man lan sau!");
        }

    }
}
