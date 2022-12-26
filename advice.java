import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sicaklik;
        System.out.print("lütfen bulunduğunuz yerin sıcaklığını yazınız:");
        sicaklik=input.nextInt();
        if (sicaklik<5){
            System.out.println("lütfen Kayak yapmaya gidiniz");
        } else if (sicaklik>5 && sicaklik<15) {
            System.out.println("lütfen sinemaya git");
            
        } else if (sicaklik>15 && sicaklik<25) {
            System.out.println("lütfen piknik yapmaya git");

        } else if (sicaklik>25) {
            System.out.println("lütfen yüzmeye git");
        }
    }

