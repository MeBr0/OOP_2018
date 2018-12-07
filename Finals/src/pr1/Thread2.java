package pr1;

import java.io.*;

public class Thread2 implements Runnable {
    private String text;

    private static final String IN = "in.txt";
    private static final String OUT = "out.txt";

    private static final String FILE_EXCEPT = "not found!";
    private static final String IO_EXCEPT = "input/output exception!";

    @Override
    public void run() {
        try {
            BufferedReader bf = new BufferedReader(new FileReader(IN));

            text = bf.readLine();

            bf.close();
        }
        catch (FileNotFoundException e) {
            System.out.println(IN + " " + FILE_EXCEPT);
        }
        catch (IOException e) {
            System.out.println(IN + " " + IO_EXCEPT);
        }

        try {
            PrintWriter pw = new PrintWriter(OUT);

            pw.write(text);

            pw.flush();
            pw.close();
        }
        catch (FileNotFoundException e) {
            System.out.println(OUT + " " + FILE_EXCEPT);
        }

    }
}
