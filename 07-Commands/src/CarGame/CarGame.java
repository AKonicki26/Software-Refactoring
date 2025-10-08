package CarGame;

import Command.Command;

import java.util.LinkedList;
import java.util.Queue;

public class CarGame {
    // your code
    Queue<Command> commandsExecuted = new LinkedList<Command>();

    public void performRecordCommand(Command command) {
        command.execute();
        commandsExecuted.add(command);
    }

    public void replay() {
        for (Command command : commandsExecuted) {
            command.execute();
        }
    }
}
