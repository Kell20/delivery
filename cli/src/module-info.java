
import core.service.cli.CLIServiceProvider;
import cli.provider.CLIServiceProviderImpl;

module cli {
    requires core;
    provides CLIServiceProvider with CLIServiceProviderImpl;
}