
import java.io.*;

class Programm {

    public static void main(String[] args) {

        try {
            File file = new File("C:\\Users\\M2\\Desktop\\out.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            //Writer.writeUsingFileWriter("<h5>Совместимые модели ноутбуков (список постоянно дополняется) :</h5><br>" + "\r\n");
            //Writer.writeUsingFileWriter("<div style=\"overflow-x:auto;\">"+ "\r\n");
            Writer.writeUsingFileWriter("<div style=\"overflow-x:auto;\"><table class=\"table table-bordered\">" + "\r\n");
            Writer.writeUsingFileWriter("<tbody>" + "\r\n");
            Writer.writeUsingFileWriter("<tr>" + "\r\n");
            while (line != null) {

                for (int i = 0; i < 3; i++) {
                    if (line == null) {
                        break;
                    }
                    line = "<td>"+ line + "</td>" + "\r\n";// работаем со строкой
                    Writer.writeUsingFileWriter(line);// пишем строки в файл

                    // считываем остальные строки в цикле
                    line = reader.readLine();
                }
                if (line != null) {
                    Writer.writeUsingFileWriter("</tr><tr>" + "\r\n");
                }
            }
            Writer.writeUsingFileWriter("</tr>" + "\r\n");
            Writer.writeUsingFileWriter("</tbody>" + "\r\n");
            Writer.writeUsingFileWriter("</table>" + "\r\n");
            Writer.writeUsingFileWriter("</div>" + "\r\n");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}

