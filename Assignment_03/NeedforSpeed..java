class NeedForSpeed {
    int speed = 5;
    int batteryDrain = 0;
    int distanceDriven = 0;
    int remainingBattery = 100;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {

        if(remainingBattery < batteryDrain){
            return true;
        }
        return false; 
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
           
        if(!batteryDrained()) {
            distanceDriven += speed;
            remainingBattery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        NeedForSpeed car = new NeedForSpeed(50,4);
        return car;
    }
}

class RaceTrack {
    int distance = 800;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

     public boolean tryFinishTrack(NeedForSpeed car) {
        while(!car.batteryDrained()){
            car.drive();
        }
        if(car.distanceDriven() >= this.distance){
            return true;
        }else
            return false;
    }
}
