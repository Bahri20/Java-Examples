import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, select;
        System.out.print("Lütfen Birinci Sayıyı Giriniz: ");
        n1 = input.nextInt();
        System.out.println("LÜTFEN BİR İŞLEM NUMARASI SEÇİNİZ:");
        System.out.println(" 1:toplama \n 2:çıkarma \n 3:çarpma \n 4:bölme");
        select = input.nextInt();
        System.out.print("Lütfen İkinci Sayıyı Giriniz: ");
        n2 = input.nextInt();
        switch (select) {
            case 1:
                System.out.print("sonucunuz: " + (n1 + n2));
                break;
            case 2:
                System.out.print("sonucunuz: " + (n1 - n2));
                break;
            case 3:
                System.out.print("sonucunuz: " + (n1 * n2));
                break;
            case 4:
                System.out.print("sonucunuz: " + (n1 / n2));
                break;
            default:
                System.out.print("lütfen kontrol ediniz 1-4 arası rakam girebilrisiniz!");

        }
    }
}
