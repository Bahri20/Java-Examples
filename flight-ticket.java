import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  yas,Yindirimi,gg;
        double ucret,yolucreti=0.10,km;
        System.out.print("mesafeyi km türünden yazınız: ");
        km= input.nextDouble();
        ucret=km * yolucreti;

        System.out.print("yaşınızı giriniz:");
        yas= input.nextInt();
        if (yas<12){
            ucret=ucret/2;
        } else if ((yas>=12)&&(yas<24)) {
            ucret=ucret-ucret/10;
        }else if (yas>65){
            ucret=ucret-(3*ucret/10);
        }
        System.out.println("lütfen yolculuk tercihinizi yapınız");
        System.out.println("1: Sadece gidiş");
        System.out.println("2: Hem Gidiş Hem Geliş");
        gg= input.nextInt();
        switch (gg) {
            case 1:
                System.out.println("toplam tutarınız: " + ucret);
                break;
            case 2:
                ucret=ucret-(2*ucret/10);
                System.out.println("toplam tutarınız: " + ucret);
                break;
            default:
                System.out.println("yanlış sayı girdiniz lütfen kontrol ediniz!");
        }
        
    }
}
