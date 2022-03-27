package ro.nicolaemariusghergu.bootstrap.commands;

public sealed interface ICommand permits
        StartupBackendCoreCommand {

    String getCommand(CommandType commandType);

    enum CommandType {
        BACKEND_CORE,
        BACKEND_AUTH,
        BACKEND_DATA,
        FRONTEND_CORE,
        FRONTEND_AUTH
    }
}
