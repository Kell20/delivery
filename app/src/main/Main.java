package main;

import java.util.Optional;
import java.util.Scanner;
import java.util.ServiceLoader;
import core.service.cli.CLIServiceProvider;
import core.service.cli.CommandLineInterface;


public class Main{
    private static ServiceLoader<CLIServiceProvider> cliProvider = ServiceLoader.load(CLIServiceProvider.class);

    public static void main(String[] args){
        System.out.print("C:\\Users\\hp>");

        loadInterface();
    }
    private static void loadInterface(){

        Optional<CLIServiceProvider> cli = cliProvider.findFirst();
        cli.ifPresent(cliServiceProvider -> startCLIServices(cliServiceProvider.get()));
    }

    private static void startCLIServices(CommandLineInterface cliInterface){
        Scanner in = new Scanner(System.in);
        String cmd = in.nextLine();
        cliInterface.executeCMD(cmd);
    }

    private static void startGUIServices(){

    }
}