import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new  Scanner(System.in);
        int km;
        double perKm=2.20 , total, StartPrice=10;
        System.out.print("mesafeyi Km cinsinden yazınız: ");
        km= input.nextInt();
        total= (km * perKm);
        total +=StartPrice;
        total= (total<20 ? 20: total);
        System.out.println("toplam ücret: "+ total);
    }
}
