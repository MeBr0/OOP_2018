package pr5;

public class MyThread extends Thread {
    private int sleep;
    private int deltaSalary;

    private static Employee employee;

    private static final String INTER_EXCEPT = "Thread interrupted!";

    {
        employee = new Employee("Aza", 0);
    }

    public MyThread(int sleep, int deltaSalary) {
        this.sleep = sleep;
        this.deltaSalary = deltaSalary;
    }

    @Override
    public void run() {

        while (true) {

            synchronized (this) {
                employee.raiseSalary(deltaSalary);

                System.out.println(employee);
            }

            try {
                Thread.sleep(sleep);
            }
            catch (InterruptedException e) {
                System.out.println(INTER_EXCEPT);
            }

        }
    }
}
