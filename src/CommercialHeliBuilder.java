public class CommercialHeliBuilder implements IHeliBuilder{
    Helicopter helicopter = null;
    public CommercialHeliBuilder() {
        helicopter = new Helicopter();
        helicopter.reference = "Commercial helicopter";
        AltitudeMonitor altitudeMonitor = new AltitudeMonitor(helicopter);
        helicopter.registerObserver(altitudeMonitor);
    }

    public void buildEngine() {
        helicopter.setEngine(new Engine());
    }

    public void buildRotor() {
        helicopter.setRotor(new Rotor());
    }

    public void buildCockpit() {
        helicopter.setCockpit(new Cockpit());
    }

    @Override
    public Helicopter getHelicopter() {
        return this.helicopter;
    }
}
