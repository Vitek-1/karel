import java.util.Arrays;
import java.util.Scanner;

public class KvadraticRvc implements Command{
    @Override
    public String execute() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Napis mi tvou kvadratickou rovnici: ");
        String kvadratickaRvc = sc.next();
        String[] prvni = kvadratickaRvc.split("x\\^2");
        String[] druhe = prvni[1].split("x");

        double disc =  Math.sqrt(Double.parseDouble(druhe[0]) * Double.parseDouble(druhe[0]) -4 * Double.parseDouble(prvni[0]) * Double.parseDouble(druhe[1]));
        disc = Math.round(disc * 100.0) / 100.0;
        double x1 = Math.round(((-1 * Double.parseDouble(druhe[0]) + disc) / 2 * Double.parseDouble(prvni[0])) * 100.0)  / 100.0;
        double x2 = Math.round(((-1 * Double.parseDouble(druhe[0]) - disc) / 2 * Double.parseDouble(prvni[0])) * 100.0)  / 100.0;
        return "[" + x1 + ", " + x2 + "]";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
