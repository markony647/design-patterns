package patterns.command;

public class MusicOnCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Music is on");
    }
}
