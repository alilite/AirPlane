public class MilitaryPlaneBuilder implements IPlaneBuilder{
    Airplane airplane = null;
    public MilitaryPlaneBuilder() {
        airplane = new Airplane();
        airplane.reference = "Military airplane";
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
