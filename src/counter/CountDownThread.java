package counter;

public class CountDownThread extends Thread{
    int count;
    int waitValue;
    public CountDownThread(int c, int wV){
        count = c;
        waitValue = wV;
    }

    @Override
    public void run() {
        try{
            for (int i = count; i >= 0; i--) {
                System.out.println(getName()+" "+i);
                Thread.sleep(waitValue);
            }
        } catch (InterruptedException e){
            System.out.println("Blocked!");
        }
    }
}
