package garage.engine;

public class ElectricEngine implements IEngine{

    private int horsePower;
    private int batterPercentage;

    public ElectricEngine(int horsePower, int batterPercentage) {
        this.horsePower = horsePower;
        this.batterPercentage = batterPercentage;
    }

    @Override
    public int getHorsePower() {
        return this.horsePower;
    }

    @Override
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getBatterPercentage() {
        return this.batterPercentage;
    }

    public void setBatterPercentage(int batterPercentage) {
        this.batterPercentage = batterPercentage;
    }
}
