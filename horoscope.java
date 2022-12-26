import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month,day;
        System.out.print("Kaç nolu ayda doğdunuz? ");
        month= input.nextInt();
        System.out.print("ayın kaçında doğdunuz? ");
        day= input.nextInt();
        switch (month){
            case 1:
                if ((day>=1)&&(day<=31)){
                    if (day<22){
                        System.out.println("OĞLAK BURCUSUNUZ");
                    }else{
                        System.out.println("KOVA BURCUSUNUZ");}
                    break;
                }
            case 2:
                if ((day>=1)&&(day<=28)){
                    if (day<19){
                        System.out.println("KOVA BURCUSUNUZ");
                    }else{
                        System.out.println("BALIK BURCUSUNUZ");}
                    break;
                }
            case 3:
                if ((day>=1)&&(day<=31)){
                    if (day<21){
                        System.out.println("BALIK BURCUSUNUZ");
                    }else{
                        System.out.println("KOÇ BURCUSUNUZ");}
                    break;
                }
            case 4:
                if ((day>=1)&&(day<=30)){
                    if (day<21){
                        System.out.println("KOÇ BURCUSUNUZ");
                    }else{
                        System.out.println("BOĞA BURCUSUNUZ");}
                    break;
                }
            case 5:
                if ((day>=1)&&(day<=31)){
                    if (day<22){
                        System.out.println("BOĞA BURCUSUNUZ");
                    }else{
                        System.out.println("İKİZLER BURCUSUNUZ");}
                    break;
                }
            case 6:
                if ((day>=1)&&(day<=30)){
                    if (day<24){
                        System.out.println("İKİZLER BURCUSUNUZ");
                    }else{
                        System.out.println("YENGEÇ BURCUSUNUZ");}
                    break;
                }
            case 7:
                if ((day>=1)&&(day<=31)){
                    if (day<23){
                        System.out.println("YENGEÇ BURCUSUNUZ");
                    }else{
                        System.out.println("ASLAN BURCUSUNUZ");}
                    break;
                }
            case 8:
                if ((day>=1)&&(day<=31)){
                    if (day<23){
                        System.out.println("ASLAN BURCUSUNUZ");
                    }else{
                        System.out.println("BAŞAK BURCUSUNUZ");}
                    break;
                }
            case 9:
                if ((day>=1)&&(day<=30)){
                    if (day<23){
                        System.out.println("BAŞAK BURCUSUNUZ");
                    }else{
                        System.out.println("TERAZİ BURCUSUNUZ");}
                    break;
                }
            case 10:
                if ((day>=1)&&(day<=31)){
                    if (day<23){
                        System.out.println("TERAZİ BURCUSUNUZ");
                    }else{
                        System.out.println("AKREP BURCUSUNUZ");}
                    break;
                }
            case 11:
                if ((day>=1)&&(day<=30)){
                    if (day<22){
                        System.out.println("AKREP BURCUSUNUZ");
                    }else{
                        System.out.println("YAY BURCUSUNUZ");}
                    break;
                }
            case 12:
                if ((day>=1)&&(day<=31)){
                    if (day<22){
                        System.out.println("YAY BURCUSUNUZ");
                    }else{
                        System.out.println("OĞLAK BURCUSUNUZ");}
                    break;
                }
            default:
                System.out.println("lütfen kontrol ediniz yanlış sayı girdiniz!");
        }
    System.out.println("Program Bitti..");




        }
}
