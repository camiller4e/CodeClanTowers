import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Guest guest1;
    Guest guest2;

    @Before
    public void setUp() {
        bedroom1 = new Bedroom(1, 50, BedroomType.SINGLE);
        bedroom2 = new Bedroom(2, 100, BedroomType.DOUBLE);
        bedroom3 = new Bedroom(3, 100, BedroomType.DOUBLE);
        guest1 = new Guest("Colin");
        guest2 = new Guest("Neil");

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

    @Test
    public void canAddGuests(){
        bedroom1.addGuests(guest1);
        assertEquals(1, bedroom1.guestCount());
    }

    @Test
    public void canRemoveGuests(){
        bedroom1.addGuests(guest1);
        bedroom1.removeGuests();
        assertEquals(0, bedroom1.guestCount());
    }

    @Test
    public void canAddMultipleGuests(){
        bedroom2.addGuests(guest1);
        bedroom2.addGuests(guest2);
        assertEquals(2, bedroom2.guestCount());
    }

    @Test
    public void cantAddBeyondCapacity(){
        bedroom1.addGuests(guest1);
        bedroom1.addGuests(guest2);
        assertEquals(1, bedroom1.guestCount());
    }



}
