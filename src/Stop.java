public class Stop implements Command{
    @Override
    public String execute() {
        return "Goodbye!";
    }

    @Override
    public boolean exit() {
        return true;
    }
}
