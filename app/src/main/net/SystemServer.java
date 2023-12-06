package main.net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SystemServer implements Runnable  {

    private static ServerSocket serverSocket;
    private Socket socket;
    SystemServer(){
        try{
            serverSocket = new ServerSocket();
        }
        catch(IOException e){
            /*
            * we need to handle exception appropriately
            *
            * */
        }
    }
    public ServerSocket getServerInstance(){
        return serverSocket;
    }

    @Override
    public void run(){

        while(true){
            try{
                socket = serverSocket.accept();
                StaticQueue.getQueue().addLast(socket);
            }
            catch(IOException e){
                /*
                 * we need to handle exception appropriately
                 *
                 * */
            }
        }

    }
}

