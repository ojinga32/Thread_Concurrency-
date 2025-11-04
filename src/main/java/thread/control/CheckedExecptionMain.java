package thread.control;

public class CheckedExecptionMain {

    public static void main(String[] args) throws Exception {
        throw new Exception();

    }

    static class CheckedRunable implements Runnable{
        @Override
        public void run() /* throws Exception */ {
//            throw new Exception();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
