package Utils;

import java.util.ArrayList;
import Utils.Client;

public class Room {

    private String roomID;
    private String server;
    private Client owner;
    private ArrayList<Client> clients;

    public Room(String roomID, String server, Client owner, ArrayList<Client> clients){
        this.roomID = roomID;
        this.server = server;
        this.owner = owner;
        this.clients = clients;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }
}
