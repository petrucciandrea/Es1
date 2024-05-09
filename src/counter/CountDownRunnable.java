package counter;
public class CountDownRunnable implements Runnable{
    int count;
    int waitValue;
    public CountDownRunnable(int c, int wV){
        count = c;
        waitValue = wV;
    }
    @Override
    public void run() {
        try {
            for (int i = count; i >= 0; i--) {
                System.out.println(Thread.currentThread().getName()+" "+i);
                count=i;
                Thread.sleep(waitValue);
            }
        } catch(InterruptedException e) {
            System.out.println("Blocked!");
        }
    }
}
