public class ElonsToyCar {
    int batteryCount = 100;
    int meterCount = 0;
    
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven "+(meterCount)+" meters";
    }

    public String batteryDisplay() {
        return batteryCount != 0 ? "Battery at "+(batteryCount)+"%" : "Battery empty";
    }

    public void drive() {

        if(batteryCount > 0) {
            meterCount += 20;
            batteryCount -= 1;
        }
    }
}
