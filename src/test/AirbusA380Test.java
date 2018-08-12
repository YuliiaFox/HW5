package test;


import model.AirbusA380;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class AirbusA380Test {

    @Test
    public void testInitialization() {
        AirbusA380 airbusA380 = new AirbusA380();

        assertEquals("wrong range of flight", 15200.0, airbusA380.getRangeOfFlight());
        assertEquals("wrong capacity",853.0, airbusA380.getCapacity());
        assertEquals("wrong carrying capacity", 575000.0, airbusA380.getCarryingCapacity());
    }

}
