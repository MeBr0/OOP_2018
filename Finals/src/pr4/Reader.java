package pr4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;

public class Reader {
    private HashSet<String> set;

    private static final String PATH = "text.txt";

    private final String FILE_EXCEPT = "not found!";
    private final String IO_EXCEPT = "input/output exception!";

    {
        set = new HashSet<>();
    }

    public int count() {
        try {
            BufferedReader bf = new BufferedReader(new FileReader(PATH));

            String line;

            while (true) {
                line = bf.readLine();

                if (line == null) break;

                set.addAll(Arrays.asList(line.split(" ")));
            }

            return set.size();
        }
        catch (FileNotFoundException e) {
            System.out.println(FILE_EXCEPT);
        }
        catch (IOException e) {
            System.out.println(IO_EXCEPT);
        }

        return 0;
    }
}
