import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner alfa = new Scanner(System.in);
        System.out.print("lütfen sayınızı giriniz: ");
        int n= alfa.nextInt();
        for (int i = 0; i <= n ; i++) {
            for (int y = 0; y < (n - i); y++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int t = n-2; t >= 0 ; t--) {
            for (int c = 2; c <= (n - t); c++) {
                System.out.print(" ");
            }
            for (int g = 1; g <= (2 * t + 1); g++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
