import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class FileManager {

    public Collection<String> read(String file) throws FileNotFoundException {
        Scanner reader = new Scanner(new File(file));
        Collection<String> fileToString = new ArrayList<>();

        while (reader.hasNext()) {
            fileToString.add(reader.nextLine());
        }

        return fileToString;
    }

    public void save(String file, String text) throws IOException {
        Scanner reader = new Scanner(new File(file));
        FileWriter fileWriter = new FileWriter(file, false);
        fileWriter.write(text);
        fileWriter.close();
    }

    public void save(String file, ArrayList<String> texts) throws IOException {
        Scanner reader = new Scanner(new File(file));
        FileWriter fileWriter = new FileWriter(file, false);

        for (String line : texts) {
            fileWriter.append(line);
        }
        fileWriter.close();
    }
}