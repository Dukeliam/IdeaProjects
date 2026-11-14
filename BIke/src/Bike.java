public class Bike {
    private boolean on = false;
    private int speed = 0;
    private int gear = 1;

    public void turnOn() { on = true; }

    public boolean isPoweredOn() { return on; }

    public void turnOff() { on = false; }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    public void accelerate() {
        if (on == false) {
            return;
        }

        if (gear == 1) {
            speed = speed + 1;
        } else if (gear == 2) {
            speed = speed + 2;
        } else if (gear == 3) {
            speed = speed + 3;
        } else {
            speed = speed + 4;
        }
        changeGear();
    }

    public int changeGear(){

        if(speed >=0 && speed <= 20) {
            gear = 1;
        } else if (speed >= 21 && speed <= 30) {
            gear = 2;
        } else if (speed >= 31 && speed <= 40) {
            gear = 3;
        } else {
            gear = 4;
        }
            return gear;
    }

    public void decelerate() {
        if (on == false) {
            return;
        }

        if (gear == 1) {
            speed = speed - 1;
        } else if (gear == 2) {
            speed = speed - 2;
        } else if (gear == 3) {
            speed = speed - 3;
        } else {
            speed = speed - 4;
        }

        if (speed < 0) {
            speed = 0;
        }

        changeGear();
    }
}
