public class Main {
    public static void main(String[] args) {
        Kmetre t1= new Kmetre("thread1");
        Kmetre t2= new Kmetre("thread2");
        Kmetre t3= new Kmetre("thread3");
        Kmetre t4= new Kmetre("thread4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}