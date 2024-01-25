package ElonsToyCar;
public class ElonsToyCar {
    private int distanceTraveled;
    private int batteryLevel;

    private ElonsToyCar(String Ferrary) {
        this.distanceTraveled = 0;
        this.batteryLevel = 100; // Assuming full battery initially
    }

    public static ElonsToyCar buy(String modelName) {
        System.out.println("Buying " + modelName + " toy car!");
        return new ElonsToyCar(modelName);
    }

    public String distanceDisplay() {
        return "Distance Traveled: " + distanceTraveled + " meters";
    }

    public String batteryDisplay() {
        return "Battery Level: " + batteryLevel + "%";
    }

    public void drive(int distance) {
        if (batteryLevel > 0) {
            distanceTraveled += distance;
            batteryLevel -= 10; // Assuming each drive consumes 10% of battery
            System.out.println("Driving " + distance + " meters");
        } else {
            System.out.println("Battery empty. Please recharge.");
        }
    }


}


