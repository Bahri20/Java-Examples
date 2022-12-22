import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new  Scanner(System.in);
        int armut=2,elma=3,domates=1,muz=9,patlican=5,toplam;
        int a,e,d,m,p;
        System.out.print("armut kaç kilo? ");
        a= input.nextInt();
        System.out.print("elma kaç kilo? ");
        e=input.nextInt();
        System.out.print("domates kaç kilo? ");
        d= input.nextInt();
        System.out.print("muz kaç kilo? ");
        m= input.nextInt();
        System.out.print("patlıcan kaç kilo? ");
        p= input.nextInt();
        toplam=(armut*a)+(e*elma)+(d*domates)+(m*muz)+(patlican*p);
        System.out.print("toplam tutarınız: " + toplam);

    }
}
