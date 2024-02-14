import garage.air.Helicopter;
import garage.air.Plane;
import garage.land.Car;
import garage.engine.CombustionEngine;
import garage.engine.ElectricEngine;
import garage.engine.IEngine;
import garage.water.CargoShip;

public class Runner {

    public static void main(String[] args) {

        IEngine combustionEngine = new CombustionEngine(99, "01/01/2024");
        Car hondaJazz = new Car(1300, 150, "hatchback", combustionEngine);
        System.out.println(hondaJazz.getHorsePower());

        IEngine electricEngine = new ElectricEngine(399, 100);
        hondaJazz.setEngine(electricEngine);
        System.out.println(hondaJazz.getHorsePower());

        CargoShip cargoShip = new CargoShip(100,100,100, "steel", combustionEngine);
        System.out.println(cargoShip.getHorsePower());

        cargoShip.setEngine(electricEngine);
        System.out.println(cargoShip.getHorsePower());

        Helicopter chopper = new Helicopter(5, 1, "Spinny", combustionEngine);
        System.out.println(chopper.getHorsePower());
        System.out.println(chopper.getRadarType());

        chopper.setEngine(electricEngine);
        chopper.setRadarType("Coney");
        System.out.println(chopper.getHorsePower());
        System.out.println(chopper.getRadarType());

        Plane paperPlane = new Plane(120000, 1000000, "Pingie", electricEngine);
        System.out.println(paperPlane.getHorsePower());
        System.out.println(paperPlane.getRadarType());

        paperPlane.setEngine(combustionEngine);
        paperPlane.setRadarType("Coney 2.0");
        System.out.println(paperPlane.getHorsePower());
        System.out.println(paperPlane.getRadarType());
    }

}
