package seedu.easyLog.commands;

public class ExitCommand extends Command {

    public void execute() {
        ui.showExit();
        System.exit(0);
    }
}
