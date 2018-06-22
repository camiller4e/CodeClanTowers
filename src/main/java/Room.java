import java.util.ArrayList;

public abstract class Room {
    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity){
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public int getCapacity(){
        return capacity;
    }

    public void addGuests(Guest guest){
        if (capacity > guestCount()){
        this.guests.add(guest);}
    }

    public void removeGuests(){
        this.guests.clear();
    }

    public int guestCount(){
        return this.guests.size();
    }
}
