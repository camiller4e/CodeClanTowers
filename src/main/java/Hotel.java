import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<Room> rooms;

    public Hotel(String name){
        this.name = name;
        this.rooms = new ArrayList<Room>();
    }

    public String getName(){
        return name;
    }

    public void addRooms(Room room){
        this.rooms.add(room);
    }

    public int roomCount(){
        return this.rooms.size();
    }

    public void checkInGuest(Guest guest, Bedroom bedroom) {
        if (bedroom.getNightlyRate() <= guest.getDuckets())
            guest.wallet -= bedroom.getNightlyRate();
            bedroom.addGuests(guest);
        }


    public void addGuestToConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        if (conferenceRoom.getDailyRate() <= guest.getDuckets())
            guest.wallet -= conferenceRoom.getDailyRate();
            conferenceRoom.addGuests(guest);
    }
}

