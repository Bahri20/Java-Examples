public class Teacher {
    String name;
    String branch;

    public Teacher(String name, String branch){
        this.name=name;
        this.branch=branch;
    }
    void print(){
        System.out.println("adı:"+this.name);
        System.out.println("branşı:"+this.branch);
    }

}
