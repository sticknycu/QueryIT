package ro.nicolaemariusghergu.bootstrap;

import ro.nicolaemariusghergu.bootstrap.commands.AbstractCommand;
import ro.nicolaemariusghergu.bootstrap.commands.ICommand;
import ro.nicolaemariusghergu.bootstrap.commands.StartupBackendCoreCommand;

public class BootstrapApplication {

    public static void main(String[] args) {
        AbstractCommand command = new StartupBackendCoreCommand();
        String output = command.executeCommand(ICommand.CommandType.BACKEND_CORE);
        System.out.println(output);
    }

}
