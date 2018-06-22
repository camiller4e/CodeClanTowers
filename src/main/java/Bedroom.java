public class Bedroom extends Room {
    private int roomNum;
    private int nightlyRate;
    private BedroomType type;

    public Bedroom(int roomNum, int nightlyRate, BedroomType type){
        super(type.getCapacity());
        this.roomNum = roomNum;
        this.nightlyRate = nightlyRate;
        this.type = type;
    }

    public int getRoomNum(){
        return roomNum;
    }

    public int getNightlyRate() {
        return nightlyRate;
    }

    public BedroomType getType() {
        return type;
    }
}
