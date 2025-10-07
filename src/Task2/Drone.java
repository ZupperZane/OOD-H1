package Task2;

public abstract class Drone {
    //variables
    int BatteryCap;
    int FlightRange;
    String SpecialFeatures;
    //print method
    public void desc() {
        System.out.println("Battery Capacity in mAh: " + this.BatteryCap);
        System.out.println("Flight Range in km: " + this.FlightRange);
        System.out.println("Special Feature: " + this.SpecialFeatures);
        System.out.print(" ");
    }

}
