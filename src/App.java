import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        readFile();
    }
    public static void readFile() throws FileNotFoundException {
        FileReader fr = new FileReader("adat.txt");
        Scanner scan = new Scanner(fr);
        while(scan.hasNextLine()) {
            String lines = scan.nextLine();
            System.out.println(lines);
        }
    }
}
