import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ConferenceRoomTest {
    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    ConferenceRoom conferenceRoom3;
    Guest guest1;

    @Before
    public void setUp() {
        conferenceRoom1 = new ConferenceRoom(50, "Balthasar", 50);
        conferenceRoom2 = new ConferenceRoom(100, "Melchior", 100);
        conferenceRoom3 = new ConferenceRoom(20, "Gaspar", 500);
        guest1 = new Guest("Colin");
    }

    @Test
    public void hasCapacity(){
        assertEquals(50, conferenceRoom1.getCapacity());
    }

    @Test
    public void hasName() {
        assertEquals("Melchior", conferenceRoom2.getRoomName());
    }

    @Test
    public void hasDailyRate() {
        assertEquals(500, conferenceRoom3.getDailyRate());
    }

    @Test
    public void canAddGuests(){
        conferenceRoom1.addGuests(guest1);
        assertEquals(1, conferenceRoom1.guestCount());
    }
}
