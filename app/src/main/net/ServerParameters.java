package main.net;

import java.util.HashMap;
public class ServerParameters {
    private static HashMap<String,String> serverParams = new HashMap<>();
    public void setServerParams(String param, String value){
        if(serverParams.containsKey(param)){
            return;
        }

        else{
            serverParams.put(param, value);
        }

    }

    public String getServerParams(String param){
        return serverParams.getOrDefault(param, "");
    }
}
