public class MilitaryFactory extends AircraftFactory {

    @Override
    public Airplane createAirplane() {
        MilitaryPlaneBuilder militaryPlaneBuilder = new MilitaryPlaneBuilder();
        PlaneEngineer engineer = new PlaneEngineer(militaryPlaneBuilder);
        engineer.createAirplane();
        return engineer.getPlane();
    }

    @Override
    public Helicopter createHelicopter() {
        MilitaryHeliBuilder militaryHeliBuilder = new MilitaryHeliBuilder();
        HeliEngineer engineer = new HeliEngineer(militaryHeliBuilder);
        engineer.createHelicopter();
        return engineer.getHelicopter();
    }
}
