package Task2;

public abstract class Drone {

    int BatteryCap;
    int FlightRange;
    String SpecialFeatures;

    public void desc() {
        System.out.println("Battery Capacity in mAh: " + this.BatteryCap);
        System.out.println("Flight Range in km: " + this.FlightRange);
        System.out.println("Special Feature: " + this.SpecialFeatures);
    }

}
