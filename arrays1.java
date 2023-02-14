import java.util.Scanner;
public class Main {
    public static void mean(int array[]){
        int total=0;
        for (int i=0;i<array.length;i++){
            total+=array[i];
        }
        System.out.println("ortalama: "+ (double)total/array.length);

    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int [] array1 = new int[5];
        System.out.println("elemanları giriniz: ");
        for (int i=0;i<array1.length;i++){
            array1[i]=input.nextInt();
        }
        mean(array1);
    }
}
