package Requests;

import Handlers.NewIdentityHandler;
import Utils.Client;
import Utils.ClientsYML;
import Utils.YMLReader;
import Utils.YMLWriter;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class NewIdentityRequest {

    String identity;
    String type;

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void receiveNewIdentityRequest(String serverName, int port) throws IOException {

        ServerSocket ss = new ServerSocket(port);
        Socket s = ss.accept();

        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader bf = new BufferedReader(in);
        StringBuilder sb = new StringBuilder();

        sb.append(bf.readLine());

        JSONObject newIdentityJson = new JSONObject(sb.toString());
        String identity = (String) newIdentityJson.get("identity");
        String server = (String) newIdentityJson.get("server");

        new NewIdentityHandler().addNewIdentity(identity, server);

    }


}
