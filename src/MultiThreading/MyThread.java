package MultiThreading;

public class MyThread implements Runnable {

    public int threadNumber;
    public MyThread(int threadNumber){
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try { 
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MyThread myThread = new MyThread(i);
            Thread thread = new Thread(myThread);
            thread.start();
        }


    }

}
