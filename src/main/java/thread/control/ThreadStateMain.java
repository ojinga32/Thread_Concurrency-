package thread.control;

import static util.MyLogger.log;

public class ThreadStateMain {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunnable(), "myThread");
        log("myThread.State1 = " + thread.getState());
        log("myThread.start()");
        thread.start();
        thread.sleep(1000);
        log("myThread.State3 = " + thread.getState());
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            try {
                log("start");
                log("myThread.State2 = " + Thread.currentThread().getState());
                log("sleep() start");
                Thread.sleep(3000);
                log("sleep() end");
                log("myThread.State4 = " + Thread.currentThread().getState());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
