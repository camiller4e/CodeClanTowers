public class ConferenceRoom extends Room {
    private String roomName;
    private int dailyRate;

    public ConferenceRoom(int capacity, String roomName, int dailyRate){
        super(capacity);
        this.roomName = roomName;
        this.dailyRate = dailyRate;

    }

    public String getRoomName() {
        return roomName;
    }

    public int getDailyRate() {
        return dailyRate;
    }
}
