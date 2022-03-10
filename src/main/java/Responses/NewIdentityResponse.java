package Responses;

public class NewIdentityResponse {

    String type;
    boolean approved;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public void sendNewIdentityResponse(){

    }

    public void gossipNewIdentity(){

    }
}
