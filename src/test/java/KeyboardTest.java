import behaviours.IInput;
import device_management.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class KeyboardTest {

    Keyboard keyboard;

    @Before
    public void setup(){
        keyboard = new Keyboard("Dell", "Disco");
    }

    @Test
    public void canGetModel(){
        assertEquals("Dell", keyboard.getModel());
    }

    @Test
    public void canGetType(){
        assertEquals("Disco", keyboard.getType());
    }

    @Test
    public void canSendData(){
        assertEquals("sending: keystrokes", keyboard.sendData("keystrokes"));
    }
}
