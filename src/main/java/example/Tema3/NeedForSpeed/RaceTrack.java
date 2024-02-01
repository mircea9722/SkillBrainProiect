package example.Tema3.NeedForSpeed;

public class RaceTrack {
private int distance;
    public RaceTrack(int distance) {
        this.distance = distance;
    }
    public void setDistance(int distance) {
        this.distance = distance;
    }
    public int getDistance() {
        return distance;
    }
    public boolean carCanFinish(RaceCar raceCar){
        int numberOfDrives = raceCar.getBattery() / raceCar.getBatteryDrain();
        int maximumDistance = raceCar.getSpeed() * numberOfDrives;
        if (maximumDistance >= distance){
            return true;
        }
        return false;
    }
}
