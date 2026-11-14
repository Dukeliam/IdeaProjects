public class TV {
    private boolean on = false;
    private int volume = 50;
    private int channel = 3;
    private String name = "Samsung";

    public void turnOn() {
        on = true;
    }

    public boolean isOnn() {
        return on;
    }

    public void turnOff() {
        on = false;
    }

    public void increaseVolume() {
        if (on == false) {
            return;
        }

        if (volume < 100) {
            volume++;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void decreaseVolume() {
        if (on == false) {
            return;
        }

        if (volume > 0) {
            volume--;
        }
    }

    public void changeChannel() {
        if (on == false) {
            return;
        }

        if (channel < 100) {
            channel++;
        }
    }

    public int getChannel() {
        return channel;
    }

    public void decreaseChannel() {
        if (on == false) {
            return;
        }

        if (channel > 1) {
            channel--;
        }
    }
}
