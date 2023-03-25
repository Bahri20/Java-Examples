public class Upclass {
    private String name;
    private String surname;
    private int age;
    public Upclass(String name,String surname, int age){
        this.name=name;
        this.surname=surname;
        this.age=age;
    }
    void showInfos(){
        System.out.println("adı: "+ this.name);
        System.out.println("soyadı: "+ this.surname);
        System.out.println("yaşı: "+ this.age);
    }
}
