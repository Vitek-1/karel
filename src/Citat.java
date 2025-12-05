import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Citat implements Command{

    public String execute() {
        String text = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("res//Citat.txt"));
            text = "";
            Random rn =  new Random();
            int radek = rn.nextInt(0,10);
            for (int i = 0; i < radek; i++) {
                text = br.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Neni soubor");
        } catch (IOException e) {
            System.out.println("Problem se souborem");
        } catch (NumberFormatException e) {
            System.out.println("Problem, mas to spatne napsany");
        }
        return text;
    }

    @Override
    public boolean exit() {
        return false;
    }
}
