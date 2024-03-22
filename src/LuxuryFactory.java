public class LuxuryFactory extends AircraftFactory{
    @Override
    public Airplane createAirplane() {
        LuxuryPlaneBuilder luxuryPlaneBuilder = new LuxuryPlaneBuilder();
        PlaneEngineer engineer = new PlaneEngineer(luxuryPlaneBuilder);
        engineer.createAirplane();
        return engineer.getPlane();
    }

    @Override
    public Helicopter createHelicopter() {
        LuxuryHeliBuilder luxuryHeliBuilder = new LuxuryHeliBuilder();
        HeliEngineer engineer = new HeliEngineer(luxuryHeliBuilder);
        engineer.createHelicopter();
        return engineer.getHelicopter();
    }

}
