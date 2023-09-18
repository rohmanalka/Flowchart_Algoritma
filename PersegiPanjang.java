import java.util.Scanner;

public class PersegiPanjang {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int panjang;
        int lebar;
        int luas;
        int keliling;

        panjang = input.nextInt();
        lebar = input.nextInt();

        keliling = 2 * (panjang + lebar);
        luas = panjang * keliling;

        System.out.println("Keliling: " +keliling);
        System.out.println("Luas: " +luas);
    }
}