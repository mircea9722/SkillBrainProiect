package example.Tema3.ElonsToyCar;

public abstract class ElonsToyCar {
    protected int distanceDrivin;
    protected int bateryPrecentage;

    ElonsToyCar(int distanceDrivin, int BateryPrecentage) {
        this.distanceDrivin = distanceDrivin;
        this.bateryPrecentage = BateryPrecentage;
    }

    public static ElonsToyCar buy() {
        return new ElonsToyCar(0, 100) {
        };
    }

    public String distanceDisplay() {
        return "Driven " + distanceDrivin + " meters";
    }

    public String batteryDisplay() {
        if (bateryPrecentage > 0) {
            return "Baterry at " + bateryPrecentage + "%";
        } else {
            return "Battery empty";
        }
    }


    public void drive() {
        if (!(bateryPrecentage<0)){
            distanceDrivin = distanceDrivin + 20;
            bateryPrecentage = bateryPrecentage - 1;
        }
    }
}






