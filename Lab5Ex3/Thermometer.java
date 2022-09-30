package Lab5Ex3;

public class Thermometer {
    private int CurrentTemp;
    private int MaxTemp;
    private int MinTemp;

    public Thermometer() {
        CurrentTemp = 0;
        MaxTemp = Integer.MAX_VALUE;
        MinTemp = Integer.MIN_VALUE;
    }

    public Thermometer(int CurrentTemp, int MaxTemp, int MinTemp) {
        this.CurrentTemp = CurrentTemp;
        this.MaxTemp = MaxTemp;
        this.MinTemp = MinTemp;
    }

    public int getCurrentTemp() {
        return CurrentTemp;
    }

    public int getMaxTemp() {
        return MaxTemp;
    }

    public int getMinTemp() {
        return MinTemp;
    }

    public void setCurrentTemp() {
        this.CurrentTemp = CurrentTemp;
    }

    public void setMaxTemp() {
        this.MaxTemp = MaxTemp;
    }

    public void setMinTemp() {
        this.MinTemp = MinTemp;
    }

    public int setTemperature(int CurrentTemp, int MaxTemp, int MinTemp) {
        if(CurrentTemp>MaxTemp){
            this.MaxTemp = MaxTemp;
        }
        if(CurrentTemp<MinTemp){
            this.MinTemp = MinTemp;
        }
        else {
            this.MinTemp = MinTemp;
            this.MaxTemp = MaxTemp;
        }
    }

    public String toString() {
        return "\nCurrent Temperature: " + setTemperature(getCurrentTemp()) + "\nMax Temperature: "
                + setTemperature(getMaxTemp()) + "\nMin Temperature: " + setTemperature(getMinTemp());
    }

}
