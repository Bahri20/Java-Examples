public class Downclass extends Upclass{
    private String type;
    public Downclass(String name,String surname,int age,String type){
        super(name,surname,age);
        this.type=type;
    }

    @Override
    void showInfos() {
        super.showInfos();
        System.out.println("cinsiyeti:"+this.type);
    }
}
