package device_management;

import behaviours.IInput;

public class Mouse implements IInput{

    private String type;
    private String colour;

    public Mouse(String type, String colour){
        this.type = type;
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public String sendData(String data){
        return "sending: " + data;
    }
}
