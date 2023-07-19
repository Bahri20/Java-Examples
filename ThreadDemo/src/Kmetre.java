public class Kmetre implements Runnable {
    private Thread thread;
    private String threadName;

    public Kmetre(String threadName) {
        this.threadName=threadName;
        System.out.println(threadName);
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException exception){
            System.out.println("kesildi");
        }
        System.out.println("bitti");
    }
        public void start(){
            if (thread==null){
                thread= new Thread(this,threadName);
                thread.start();
            }
        }
}
