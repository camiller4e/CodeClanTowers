import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class GuestTest {
    Guest guest;

    @Before
    public void setUp() {
        guest = new Guest("Joben", 100);

    }

    @Test
    public void guestHasName(){
        assertEquals("Joben", guest.getName());
    }

    @Test
    public void guestHasDuckets(){
        assertEquals(100, guest.getDuckets());
    }
}
