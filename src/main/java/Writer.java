import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) {

    }
    public static void writeUsingFileWriter(String data) {
        File file = new File("C:\\Users\\M2\\Desktop\\in.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file,true);
            fr.write(data );
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
