import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Room room1;
    Room room2;
    Room room3;

    @Before
    public void setUp() {
        hotel = new Hotel("Hotel On Earth");
        room1 = new Bedroom(1, 50, BedroomType.SINGLE);
        room2 = new ConferenceRoom(50, "Balthasar", 50);
        room3 = new DiningRoom(50);
    }

    @Test
    public void hotelHasName(){
        assertEquals("Hotel On Earth", hotel.getName());
    }

    @Test
    public void canAddRoomsToHotel(){
        hotel.addRooms(room1);
        hotel.addRooms(room2);
        hotel.addRooms(room3);
        assertEquals(3, hotel.roomCount());
    }
}
