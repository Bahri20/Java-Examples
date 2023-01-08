import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,k,max=0,min=0;

        System.out.print("kaç tane sayı gireceksiniz? ");
        n= input.nextInt();
        for (int i=1; i<=n;i++){
            System.out.print(i +" numaralı sayıyı giriniz: ");
            k= input.nextInt();
            if (i==1){
                max=k;
                min=k;
            }
            if (k>max){
                max=k;
            }
            if (k<min){min=k;}


        }
        System.out.println("girdiginiz sayılar icinden en buyuk olani: "+max);
        System.out.println("girdiginiz sayılar icinden en kucuk olani: "+min);
    }
}
