package example.Tema3.NeedForSpeed;

public class Main {
    public static void main(String[] args) {
        int speed = 5;
        int batteryDrain = 2;
        RaceCar car = new RaceCar(speed, batteryDrain);

        int distance = 800;
        RaceTrack raceTrack = new RaceTrack(distance);

        car.drive();

        int distanceDriven = car.getDistanceDriven();
        System.out.println("Distance driven: " + distanceDriven);

        RaceCar nitro = RaceCar.nitro();
        nitro.drive();
        distanceDriven = nitro.getDistanceDriven();
        System.out.println("Nitro car distance driven: " + distanceDriven);

        System.out.println("Car can finish race: " + raceTrack.carCanFinish(nitro));
        System.out.println("Car can finish race: " + raceTrack.carCanFinish(car));
    }
}
