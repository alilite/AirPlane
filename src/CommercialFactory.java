public class CommercialFactory extends AircraftFactory {

    @Override
    public Airplane createAirplane() {
        CommercialPlaneBuilder commercialPlaneBuilder = new CommercialPlaneBuilder();
        PlaneEngineer engineer = new PlaneEngineer(commercialPlaneBuilder);
        engineer.createAirplane();
        return engineer.getPlane();
    }

    @Override
    public Helicopter createHelicopter() {
        CommercialHeliBuilder commercialHeliBuilder = new CommercialHeliBuilder();
        HeliEngineer engineer = new HeliEngineer(commercialHeliBuilder);
        engineer.createHelicopter();
        return engineer.getHelicopter();
    }
}
