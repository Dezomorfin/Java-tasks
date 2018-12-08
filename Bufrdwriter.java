import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Bufrdwriter {
    public static void main(String args []) throws IOException {
        /*
        BufferedWriter write = new BufferedWriter(new FileWriter("‪C:/Users/vagag/OneDrive/Рабочий стол/test.txt"));
        write.write("blues 40s is very cool");
        write.close();
        */
        BufferedReader read = new BufferedReader(new FileReader("‪C:/Users/vagag/OneDrive/Desktop/test.txt"));

        String line;
        while((line = read.readLine()) != null) {
            System.out.println(line);
        }
    }
}
                   