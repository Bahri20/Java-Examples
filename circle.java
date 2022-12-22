import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new  Scanner(System.in);
        double π=3.14,alan,cevre;
        int r;
        System.out.print("lütfen yarıçapı giriniz: ");
        r= input.nextInt();
        alan= π * (r*r);
        cevre= 2*π*r;
        System.out.println("Alanı: "+ alan);
        System.out.println("Çevresi: "+ cevre);
    }
}
