public class Club1_3 {
    public static void main(String[] args) {
        double a = 4;
        double b = 0;
        double c = -100;

        double d = b * b - 4 * a * c;

        if( d < 0){
            System.out.println("Рівняння коренів немає");
        } else if (d == 0) {
            double x = -1 * b / ( 2 * a );
            System.out.println("x = " + x);
        } else {
            double x1 = (-1 * b) + Math.sqrt(d) / ( 2 * a );
            double x2 = (-1 * b) - Math.sqrt(d) / ( 2 * a );
            System.out.println("x1 = "  + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
