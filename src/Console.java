import java.util.HashMap;
import java.util.Scanner;

public class Console {
    private HashMap<String, Command> commands;
    private boolean isExit;
    private Scanner scanner;

    public Console() {
        isExit = false;
        scanner = new Scanner(System.in);
        commands = new HashMap<>();
    }

    public void inicialization(){
        commands.put("date",  new Date());
        commands.put("stop",  new Stop());
    }

    public void execute(){
        System.out.print(">> ");
        String command = scanner.next();
        command = command.trim().toLowerCase();
        if (commands.containsKey(command)){
            System.out.println(commands.get(command).execute());
            isExit = commands.get(command).exit();
        }else {
            System.out.println("Command not recognized");
        }
    }

    public void start(){
        inicialization();
        do{
            execute();
        }while (!isExit);
    }

}