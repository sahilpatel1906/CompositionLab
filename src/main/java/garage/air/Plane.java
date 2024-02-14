package garage.air;

import garage.Vehicle;
import garage.engine.IEngine;
public class Plane extends Vehicle implements IAirVehicle, IEngine {

    private String radarType;
    private IEngine engine;

    public Plane(float weight, int maxSpeed, String radarType, IEngine engine){
        super(weight, maxSpeed);
        this.radarType = radarType;
        this.engine = engine;
    }

    @Override
    public String getRadarType() {
        return radarType;
    }

    @Override
    public void setRadarType(String radarType) {
        this.radarType = radarType;
    }

    public IEngine getEngine() {
        return engine;
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    @Override
    public int getHorsePower() {
        return this.engine.getHorsePower();
    }

    @Override
    public void setHorsePower(int horsePower) {
        this.engine.setHorsePower(horsePower);
    }
}