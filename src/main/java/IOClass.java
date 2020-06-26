import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOClass {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        IOClass io = new IOClass();
        //Читать из файла
        //Писать в файл
        io.processingFiles();
    }

    private void processingFiles() throws FileNotFoundException, IOException {
        FileReader fr = new FileReader("C:\\Users\\M2\\Desktop\\out.txt");
        BufferedReader br = new BufferedReader(fr);
        String str = br.readLine();
        //String result = "";
        StringBuilder result=new StringBuilder();
        while (str != null) {
            result.append('\n').append(str);
            str = br.readLine();
            //System.out.println();
        }
        FileWriter fw = new FileWriter("C:\\Users\\M2\\Desktop\\in.txt");
        fw.write(result.toString());
        fw.close();
        fr.close();
        br.close();
    }
}
