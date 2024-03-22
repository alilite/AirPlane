public class LuxuryPlaneBuilder implements IPlaneBuilder{
    Airplane airplane = null;
    public LuxuryPlaneBuilder() {
        airplane = new Airplane();
        airplane.reference = "Luxury airplane";
        AltitudeMonitor altitudeMonitor = new AltitudeMonitor(airplane);
        airplane.registerObserver(altitudeMonitor);
    }

    public void buildEngine() {
        airplane.setEngine(new Engine());
    }

    public void buildWings() {
        airplane.setWings(new Wings());
    }

    public void buildCockpit() {
        airplane.setCockpit(new Cockpit());
    }

    @Override
    public Airplane getPlane() {
        return this.airplane;
    }
}
