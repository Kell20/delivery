package main.net;

import java.net.Socket;
import java.net.ServerSocket;
import java.util.concurrent.CompletableFuture;
public class ServerManager {

    private boolean isON = false;
    private CompletableFuture<String> completableFuture = new CompletableFuture<>();
    private SystemServer systemServer = new SystemServer();
    private ServerParameters serverParameters = new ServerParameters();


    public void startServer(){
        if(serverParameters.getServerParams("ip-address").isBlank()){
            System.err.print("Error: ip-address not set");
        }

        if(serverParameters.getServerParams("port-number").isBlank()){
            System.err.print("Error: port not defined");
        }

        else{

        }
    }
}
