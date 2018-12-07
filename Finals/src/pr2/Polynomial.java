package pr2;

public class Polynomial extends MathExpression implements Comparable {
    private double coefs[];

    public Polynomial(double coefs[]) {
        this.coefs = coefs;
    }

    public double[] getCoefs() { return coefs; }

    @Override
    public double findF(double x) {
        double res = 0;

        for (int i = 0; i < coefs.length; ++i) {
            res += coefs[i] * Math.pow(x, i);
        }

        return res;
    }

//    @Override
//    public String toString() {
//        String res = "F(x) = ";
//
//        for (int i = coefs.length - 1; i > -1; --i) {
//            if (coefs[i] == -1)
//
//
//            if (i == 0)
//                res += String.format("%.2f ", coefs[i]);
//
//            else if (i == 1)
//                res += String.format("%.2fx", coefs[i]);
//
//            else
//                res += String.format("%.2fx^%d ", coefs[i], i);
//
//            if (i != 0) res += "+ ";
//        }
//
//        return res;
//    }

    @Override
    public int compareTo(Object o) {
        Polynomial p = (Polynomial) o;

        if (p.coefs.length > coefs.length)
            return -1;

        else if (p.coefs.length < coefs.length)
            return 1;

        else
            return 0;
    }
}
