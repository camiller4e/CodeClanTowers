import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;

    @Before
    public void setUp() {
        bedroom1 = new Bedroom(1, 50, BedroomType.SINGLE);
        bedroom2 = new Bedroom(2, 100, BedroomType.DOUBLE);
        bedroom3 = new Bedroom(3, 100, BedroomType.DOUBLE);

    }

    @Test
    public void hasCapacity(){
        assertEquals(1, bedroom1.getCapacity());
        assertEquals(2, bedroom2.getCapacity());
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(2, bedroom2.getRoomNum());
    }

    @Test
    public void hasNightlyRate(){
        assertEquals(100, bedroom3.getNightlyRate());
    }

    @Test
    public void getRoomType(){
        assertEquals(BedroomType.DOUBLE, bedroom3.getType());
    }

}
