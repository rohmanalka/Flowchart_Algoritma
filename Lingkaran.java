import java.util.Scanner;

public class Lingkaran {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        double phi = 3.14;
        double r;
        double luas;
        double keliling;

        r = input.nextInt();

        luas = phi * r * r;
        keliling = phi * 2 * r;

        System.out.println("Luas: " +luas);
        System.out.println("Keliling: " +keliling);

    }
}
