package device_management;

import behaviours.IInput;

import java.security.Key;

public class Keyboard implements IInput{
    private String model;
    private String type;
    
    
    public Keyboard(String model, String type){
        this.model = model;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public String sendData(String data){
        return "sending: " + data;
    }

}
