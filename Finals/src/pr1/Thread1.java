package pr1;

public class Thread1 implements Runnable {
    private static final int LIMIT = 50;
    private static final int SLEEP = 200;

    private static final String INTER_EXCEPT = "Thread interrupted!";

    @Override
    public void run() {

        for (int i = 0; i < LIMIT; ++i) {
            System.out.println(Integer.MAX_VALUE);

            try {
                Thread.sleep(SLEEP);
            }
            catch (InterruptedException e) {
                System.out.println(INTER_EXCEPT);
            }
        }
    }
}
