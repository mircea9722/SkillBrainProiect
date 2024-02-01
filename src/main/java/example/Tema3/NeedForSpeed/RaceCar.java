package example.Tema3.NeedForSpeed;

public class RaceCar {
    private int speed;
    private int battery;
    private int distanceDriven;
    private int batteryDrain;

    public RaceCar(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        battery = 100;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getDistanceDriven() {
        return distanceDriven;
    }

    public void setDistanceDriven(int distanceDriven) {
        this.distanceDriven = distanceDriven;
    }

    public int getBatteryDrain() {
        return batteryDrain;
    }

    public void setBatteryDrain(int batteryDrain) {
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrain() {
        return battery > 0;

    }

    public void drive() {
        if (battery > 0) {
            distanceDriven = distanceDriven + speed;
            battery = battery - batteryDrain;
        }

    }
    public static RaceCar nitro(){
        RaceCar car = new RaceCar(50, 4);
        return car;
    }
}

