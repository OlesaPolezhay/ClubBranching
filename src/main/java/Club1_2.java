import java.util.Scanner;

public class Club1_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        if (x == 1) {
            System.out.println("1 гривня");
        } else if (x >= 1 && x <= 4) {
            System.out.println(x + " гривні");
        } else {
            System.out.println(x + " гривень");
        }
    }
}
