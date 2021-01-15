import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) throws Exception {
        FileManager f = new FileManager();
        ArrayList<String> listOfString = new ArrayList<>();
        listOfString.add("Ehi, come va?\n");
        listOfString.add("Tutto bene, a te?\n");
        listOfString.add("Accipicchia quanto sto bene.\n");

        f.save("src/testinput1.txt", "Ehi oh!");

        for (String line : f.read("src/testinput1.txt")) {
            System.out.println(line);
        }

        f.save("src/testinput1.txt", listOfString);

        for (String line : f.read("src/testinput1.txt")) {
            System.out.println(line);
        }
    }
}

