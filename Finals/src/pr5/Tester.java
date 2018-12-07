package pr5;

public class Tester {

    public void begin() {
        MyThread t1 = new MyThread(2000, 1);
        MyThread t2 = new MyThread(1000, 2);

        t1.start();
        t2.start();
    }
}
