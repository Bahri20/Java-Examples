import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner alfa = new Scanner(System.in);
        int k,m,total=1;
        System.out.print("lütfen sayınızı giriniz: ");
        k= alfa.nextInt();
        System.out.print("üssünü yazınız: ");
        m=alfa.nextInt();
        for (int i=1;i<=m;i++){
            total=total*k;

        }System.out.println("sonuç.: "+ total);
    }
}
