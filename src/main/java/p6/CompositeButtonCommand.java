package p6;

import java.util.Arrays;
import java.util.List;

public class CompositeButtonCommand implements ButtonCommand {

    protected List<ButtonCommand> commands;

    public CompositeButtonCommand(ButtonCommand... commands) {
        this.commands = Arrays.asList(commands);
    }

    @Override
    public void action() {
        commands.forEach(ButtonCommand::action);
    }
}
