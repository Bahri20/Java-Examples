public class CostumerData {
    private BaseData data;
    public CostumerData(BaseData data){
        this.data=data;
    }
    public void add(){
        System.out.println("costumer added");
        this.data.log();
    }

}
