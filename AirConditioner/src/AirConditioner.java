public class AirConditioner {

    private boolean on = false;
    private int temperature = 20;

    public void turnOn(){
        on = true;
    }

    public boolean isOn(){
        return on;
    }

    public void turnOff(){
        on = false;
    }

    public void increaseTemperature(){
        if (temperature < 30)
            temperature++;
    }

    public void decreaseTemprature(){
        if (temperature > 16)
            temperature--;
    }

    public int getTemperature(){
        return temperature;
    }
}
