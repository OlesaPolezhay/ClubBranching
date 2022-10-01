import java.util.Scanner;

public class Club1_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if(x % 10 == 3){
            System.out.println("Останньою цифрою цього числа є цифра 3");
        }
        else {
            System.out.println("Число не закінчується 3");
        }
    }
}
