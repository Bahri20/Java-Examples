import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int k;int m =0;
        Scanner inp= new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        k=inp.nextInt();
        for(int i=0; i<=k;i++){
            if (i%3==0 && i%4==0){
                m+=i;
            }
        }System.out.println("Ortalama:" +m/2);



        System.out.println("Program Bitti..");
    }
}
