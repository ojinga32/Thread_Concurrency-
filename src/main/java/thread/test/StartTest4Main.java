package thread.test;

import static util.MyLogger.log;

public class StartTest4Main {

    public static void main(String[] args) {

        new Thread(new PrintWork("A", 500), "Thread-A").start();
        new Thread(new PrintWork("B", 1000), "Thread-B").start();
    }

    static class PrintWork implements Runnable  {

        String content;
        int time;

        public PrintWork(String content, int time) {
            this.content = content;
            this.time = time;
        }

        @Override
        public void run() {
            while(true) {
                log(content);
                try {
                    Thread.sleep(time);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
