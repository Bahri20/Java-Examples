import java.util.Scanner;
public class DataManager {
    private Iinterfaces Database;
    DataManager(Iinterfaces Database){
        this.Database=Database;
    }
    public void DatabaseLogin(){
        Database.login();
    }
    public void DatabaseAdd(){
        Database.add();
    }
    public void DatabaseDelete(){
        Database.delete();
    }
    public void DatabaseGet(){
        Database.get();
    }
    public void DatabaseUpdate(){
        Database.update();
    }
    public void selectMenu() {
        int kararVer;
        Scanner scanner = new Scanner(System.in);
        System.out.println("< Gerçekleştirilecek İşlemler >\n-----------------\n[1] - Veri Ekle\n[2] - Veri Sil\n[3] - Veri Getir\n[4] - Veri Güncelle\n-----------------\n-> Kararınız:");
        kararVer=scanner.nextInt();
        switch (kararVer){
            case 1:
                System.out.println("-----------------");
                DatabaseAdd();
                System.out.println("-----------------");
                break;
            case 2:
                System.out.println("-----------------");
                DatabaseDelete();
                System.out.println("-----------------");
                break;
            case 3:
                System.out.println("-----------------");
                DatabaseGet();
                System.out.println("-----------------");

                break;
            case 4:
                System.out.println("-----------------");
                DatabaseUpdate();
                System.out.println("-----------------");
                break;

            default:
                System.out.println("-----------------\n-> Tanımsız Bir Değer Girdiniz.\n-----------------");
                break;
        }

    }
}
