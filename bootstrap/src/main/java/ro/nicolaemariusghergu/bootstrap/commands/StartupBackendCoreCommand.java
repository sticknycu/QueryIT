package ro.nicolaemariusghergu.bootstrap.commands;

import org.buildobjects.process.ProcBuilder;
import ro.nicolaemariusghergu.bootstrap.utils.Constants;

public non-sealed class StartupBackendCoreCommand extends AbstractCommand implements ICommand {

    @Override
    public String getCommand(CommandType commandType) {
        return Constants.BACKEND_CORE_DIRECTORY + Constants.AND + Constants.START_DOCKER_COMMAND;
    }

    @Override
    public String executeCommand(CommandType commandType) {
        return ProcBuilder.run(getCommand(commandType));
    }
}
