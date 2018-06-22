import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class DiningRoomTest {
    DiningRoom diningRoom;

    @Before
    public void setUp() {
        diningRoom = new DiningRoom(50);
    }

    @Test
    public void hasCapacity() {
        assertEquals(50, diningRoom.getCapacity());
    }
}
