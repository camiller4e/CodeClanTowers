import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Room room1;
    Room room2;
    Room room3;
    Guest guest1;

    @Before
    public void setUp() {
        hotel = new Hotel("Hotel On Earth");
        room1 = new Bedroom(1, 50, BedroomType.SINGLE);
        room2 = new ConferenceRoom(50, "Balthasar", 50);
        room3 = new DiningRoom(50);
        guest1 = new Guest("Joben", 100);
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

    @Test
    public void canCheckInGuests(){
        hotel.addRooms(room1);
        hotel.checkInGuest(guest1, (Bedroom) room1);
        assertEquals(1, room1.guestCount());
    }

    @Test
    public void canChargeGuestNightlyRate(){
        hotel.addRooms(room1);
        hotel.checkInGuest(guest1, (Bedroom) room1);
        assertEquals(50, guest1.getDuckets());
    }

    @Test
    public void canAdmitGuestsToConferenceRoom(){
        hotel.addRooms(room2);
        hotel.addGuestToConferenceRoom(guest1, (ConferenceRoom) room2);
        assertEquals(1, room2.guestCount());
    }

    @Test
    public void canChargeGuestDailyRate(){
        hotel.addRooms(room2);
        hotel.addGuestToConferenceRoom(guest1, (ConferenceRoom) room2);
        assertEquals(50, guest1.getDuckets());
    }

//    @Test
//    public void canGetGuestList(){
//        hotel.addRooms(room1);
//        hotel.checkInGuest(guest1, (Bedroom) room1);
//        Bedroom.guestlist(room1);
//        assertEquals("Joben", room1.guestlist(room1));
//    }

    @Test
    public void canCheckOutGuests(){
        hotel.addRooms(room1);
        hotel.checkInGuest(guest1, (Bedroom) room1);
        hotel.checkOutGuest(guest1, (Bedroom) room1);
        assertEquals(0, room1.guestCount());
    }


}
