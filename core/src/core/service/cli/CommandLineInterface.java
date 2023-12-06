package core.service.cli;

import java.net.ServerSocket;
public interface CommandLineInterface {

    public void executeCMD(String cmd);
    public void handleSetIP(ServerSocket serverSocket);
    public void handleConfig();
    public void handleExit();
    public void handleSave();
    public void handleHelp();
    public void handleGetStatus();

    //public void handleStart();
    //public void handleStop();


}