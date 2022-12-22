import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
               Scanner input=new  Scanner(System.in);
                double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.0;
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
               System.out.print("toplam tutarınız: "+(armut*a)+(e*elma)+(d*domates)+(m*muz)+(patlican*p));

        }
}
