package counter;

public class ThreadCounter {
    public static void main(String[] args) throws InterruptedException{
        CountDownThread[] cdt=new CountDownThread[5];
        for(int i=0; i<cdt.length; i++) {
            cdt[i] = new CountDownThread(5, 500);
            cdt[i].start();
        }

        Thread.sleep(2000);
        for(int i=0;i<cdt.length; i++) {
            cdt[i].interrupt();
            cdt[i].join();
        }
    }
}