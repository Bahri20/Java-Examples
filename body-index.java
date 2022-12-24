import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
                Scanner input=new  Scanner(System.in);
                double kilo, boy, indeks;
                System.out.print("kilonu gir: ");
                kilo= input.nextDouble();
                System.out.print("boyunu metre cinsinden gir: ");
                boy= input.nextDouble();

                indeks=kilo/(boy*boy);
                System.out.println("vücut kitle indeksiniz: " + indeks);
        }
}
