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
}
