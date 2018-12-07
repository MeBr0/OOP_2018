package pr1;

public class Tester {

    public void begin() {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.run();
        t2.run();
    }
}
