import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil, hesap;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz:");
        yil = input.nextInt();
        hesap = yil % 12;
        String zodyak = "";
        switch (hesap) {
            case (0) -> zodyak = "Maymun";
            case (1) -> zodyak = "Horoz";
            case (2) -> zodyak = "Köpek";
            case (3) -> zodyak = "Domuz";
            case (4) -> zodyak = "Fare";
            case (5) -> zodyak = "Öküz";
            case (6) -> zodyak = "Kaplan";
            case (7) -> zodyak = "Tavşan";
            case (8) -> zodyak = "Ejderha";
            case (9) -> zodyak = "Yılan";
            case (10) -> zodyak = "At";
            case (11) -> zodyak = "Koyun";
        }
                System.out.println("Çin Zodyak Burcunuz:"+ zodyak);

    }
}
