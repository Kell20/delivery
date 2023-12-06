package main.net;

import java.net.Socket;
import java.util.LinkedList;

public class StaticQueue {
    private static LinkedList<Socket>  queue = new LinkedList<>();
    public static LinkedList<Socket> getQueue(){
        return queue;
    }
}
