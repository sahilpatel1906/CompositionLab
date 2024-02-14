package garage.air;

import garage.Vehicle;
import garage.engine.IEngine;

public class Helicopter extends Vehicle implements IAirVehicle, IEngine {
    private String radarType;
    private IEngine engine;

    public Helicopter(int maxSpeed, float weight, String radarType, IEngine engine) {
        super(weight, maxSpeed);
        this.radarType = radarType;
        this.engine = engine;
    }

    @Override
    public String getRadarType() {
        return this.radarType;
    }

    public void setRadarType(String radarType) {
        this.radarType = radarType;
    }

    public IEngine getEngine() {
        return this.engine;
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    public int getHorsePower() {
        return this.engine.getHorsePower();
    }

    public void setHorsePower(int horsePower) {
        this.engine.setHorsePower(horsePower);
    }
}
