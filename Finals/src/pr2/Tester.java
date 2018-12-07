package pr2;

public class Tester {

    public void begin() {
        double coefs[] = { 2, 3, 5, 1};
        double coefs1[] = { 2, 3, 5, 3, 4, 5 };

        Polynomial p = new Polynomial(coefs);
        Polynomial p1 = new Polynomial(coefs1);

//        System.out.println(p);

        System.out.println(p.findF(2));

        System.out.println(p1.compareTo(p));
    }
}
