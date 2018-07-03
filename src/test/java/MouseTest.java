import device_management.Mouse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MouseTest {

    Mouse mouse;

    @Before
    public void before(){
        mouse = new Mouse("cordless", "black");
    }

    @Test
    public void hasType(){
        assertEquals("cordless", mouse.getType());
    }

    @Test
    public void hasColour(){
        assertEquals("black", mouse.getColour());
    }

    @Test
    public void canSendData(){
        assertEquals("sending: clicks", mouse.sendData("clicks"));
    }
}
