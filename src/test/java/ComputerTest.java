import device_management.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import sun.jvm.hotspot.oops.OopUtilities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ComputerTest {
    Computer computer;
    Monitor monitor;
    Mouse mouse;

    @Before
    public void before() {
        monitor = new Monitor(22, 786432);
        Mouse mouse = new Mouse("cordless", "pink & fuzzy");
        computer = new Computer(8, 512, monitor, mouse);
    }

    @Test
    public void hasRam() {
        assertEquals(8, computer.getRam());
    }

    @Test
    public void hasHddSize() {
        assertEquals(512, computer.getHddSize());
    }

    @Test
    public void hasOutputDevice() {
       assertNotNull(computer.getOutputDevice());
    }

    @Test
    public void canOutputData() {
        assertEquals("space invaders is now on screen", computer.outputData("space invaders"));
    }

    @Test
    public void canOutputDataViaPrinter(){
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        Mouse mouse = new Mouse("cordless", "pink & fuzzy");
        computer = new Computer(8, 512, printer, mouse);
        assertEquals("printing: holiday pictures", computer.outputData("holiday pictures"));
    }

    @Test
    public void canOutputDataViaSpeaker(){
        Speaker speaker = new Speaker(100);
        Mouse mouse = new Mouse("cordless", "pink & fuzzy");
        computer = new Computer(8, 512, speaker, mouse);
        assertEquals("playing: Beep!", computer.outputData("Beep!"));
    }

    @Test
    public void canSetOutputDevice(){
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        computer.setOutputDevice(printer);
        assertEquals("printing: dissertation", computer.outputData("dissertation"));
    }

    @Test
    public void hasInputDevice(){
        assertNotNull(computer.getInputDevice());
    }

    @Test
    public void canInputData() {
        assertEquals("sending: clicks", computer.inputData("clicks"));
    }

    @Test
    public void canSetInputDevice(){
        Mouse mouse = new Mouse("Epson", "Blue");
        computer.setInputDevice(mouse);
        assertEquals(mouse, computer.getInputDevice());
    }

    @Test
    public void canGetDataStream(){
        assertEquals(null, computer.getDataStream());
    }

    @Test
    public void canSetDataStream(){
        computer.setDataStream("clicks");
        assertEquals("clicks", computer.getDataStream());
    }

    @Test
    public void canSaveDataStream(){
        computer.inputData("clicks");
        assertEquals("clicks", computer.getDataStream());
    }

    @Test
    public void canOutputDataStream(){
        computer.inputData("clicks");
        assertEquals("clicks is now on screen", computer.outputDataStream());
    }

}
