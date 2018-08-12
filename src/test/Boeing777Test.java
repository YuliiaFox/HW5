package test;

import model.Boeing777;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Boeing777Test{
    @Test
    public void testInitialization(){
        Boeing777 boeing777 = new Boeing777();

        assertEquals("wrong range of flight",9100.0, boeing777.getRangeOfFlight());
        assertEquals("wrong capacity",550.0, boeing777.getCapacity());
        assertEquals("wrong carrying capacity",103000.0, boeing777.getCarryingCapacity());
    }
}
