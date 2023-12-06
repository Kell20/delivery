package cli.provider;

import core.service.cli.CLIServiceProvider;
import core.service.cli.CommandLineInterface;


public class CLIServiceProviderImpl implements CLIServiceProvider{
    @Override
    public CommandLineInterface get(){
        return new CommandLineInterfaceImpl();
    }
}
