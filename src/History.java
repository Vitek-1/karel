import java.util.ArrayList;

public class History implements Command{
    private static ArrayList<String> historie = new ArrayList<>();

    public static void addHistory(String history){
        historie.add(history);
    }

    @Override
    public String execute() {
        return historie.toString();
    }

    @Override
    public boolean exit() {
        return false;
    }
}
