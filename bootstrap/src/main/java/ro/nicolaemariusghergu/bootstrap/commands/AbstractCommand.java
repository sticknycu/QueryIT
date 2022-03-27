package ro.nicolaemariusghergu.bootstrap.commands;

public abstract sealed class AbstractCommand
        permits StartupBackendCoreCommand {

    public abstract String executeCommand(ICommand.CommandType commandType);
}
