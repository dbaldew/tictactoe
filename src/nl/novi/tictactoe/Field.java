package nl.novi.tictactoe;

public class Field {

    //fields/attributes
    private String token;
    private Boolean isOccupied;

    //constructors
    public Field (String token){
        this.token = token;
        this.isOccupied = false;
    }

    //methods/functions
    public void setToken (String token){
        if (isOccupied == false){
            this.token = token;
        }
        isOccupied = true;
    }

    public  String getToken(){
        return token;
    }


}
