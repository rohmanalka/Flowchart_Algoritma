import java.util.Scanner;

public class Segitiga {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int sisi;
        int alas;
        int tinggi;
        int luas;
        int keliling;

        sisi = input.nextInt();
        alas = input.nextInt();
        tinggi = input.nextInt();

        luas = alas * tinggi / 2;
        keliling = sisi + sisi + sisi;

        System.out.println("Luas: " +luas);
        System.out.println("Keliling: " +keliling);
    }
}
