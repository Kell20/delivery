package cli.provider;

import core.service.cli.CommandLineInterface;

import java.net.ServerSocket;
import java.util.Scanner;

public class CommandLineInterfaceImpl implements CommandLineInterface{
    private boolean isExited = false;
    @Override
    public void executeCMD(String cmd){

        if(cmd.trim().equalsIgnoreCase("config")){
            isExited = false;
            while(!isExited){
                System.out.print("config>");
                handleConfig();
            }
        }

        else if(cmd.trim().equalsIgnoreCase("help")){
            handleHelp();
        }
    }

    @Override
    public void handleSetIP(ServerSocket serverSocket) {

    }

    @Override
    public void handleConfig() {
        Scanner in=new Scanner(System.in);

        /*get new command*/
        String cmd=in.nextLine();
        if(cmd.trim().equalsIgnoreCase("save")){
            handleSave();
        }

        else if(cmd.trim().equalsIgnoreCase("exit")){
            handleExit();
        }
        else if(cmd.isEmpty()){
            System.out.print("");
        }
        else if(cmd.isBlank()){
            System.out.print("");
        }
         else{
             handleHelp();
        }
    }

    @Override
    public void handleExit() {
        isExited = true;
    }

    @Override
    public void handleSave() {

    }

    @Override
    public void handleGetStatus() {

    }

    @Override
    public void handleHelp(){
        String commandLists = """
                ===============================================================================
                kampilot server program command line interface
                @product by KAM-software
                @date 01-12-2023
                @coded by Eng. Kelvin J Moshi
                          Eng. Abdulrahman S Jafari
                ===============================================================================
                usage: config <no-parameter>
                              (access server configuration terminal)
                              
                       set -ipaddress <ip-address> -port <port-number>
                            (ip-address and port-number given in numerical format not in quote)
                            eg set -ipaddress 127.0.0.1 -port 6059;
                            
                       help <no-parameter>
                            (accessing this guide)
                            
                       exit <no-parameter>
                            (exit configuration mode)
                    
                       save <no-parameter>
                            (save all configuration parameters into saverconfig.txt)
                            @the default saverconfig.txt is in []
                            
                       get -status <no-parameter>
                            (query the current server status )
                            i.e, ON status, ip-address, port-number e.t.c
                        
                       @On progress::           
                """;

        System.out.println(commandLists);
    }
}
