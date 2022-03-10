package Responses;

import java.util.ArrayList;

public class RoomListResponse {

    private String type;
    private ArrayList<String> rooms;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<String> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<String> rooms) {
        this.rooms = rooms;
    }
}
