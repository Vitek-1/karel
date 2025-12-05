import java.time.LocalDate;

public class Date implements Command{

    @Override
    public String execute() {
        LocalDate.now();
        return LocalDate.now().toString();
    }

    @Override
    public boolean exit() {
        return false;
    }
}
