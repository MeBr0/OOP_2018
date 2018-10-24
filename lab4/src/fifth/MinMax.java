package fifth;

public class MinMax {

    static class MinAndMax {
        static int max;
        static int min;

        static String print() {
            return String.format("Max: %d, Min: %d", max, min);
        }
    }

    static String minmax(int values[]) {
        MinAndMax.max = values[0];
        MinAndMax.min = values[0];

        for (int i = 1; i < values.length; ++i) {
            if (values[i] > MinAndMax.max) MinAndMax.max = values[i];

            else if (values[i] < MinAndMax.min) MinAndMax.min = values[i];
        }

        return MinAndMax.print();
    }
}
