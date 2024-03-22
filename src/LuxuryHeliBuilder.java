public class LuxuryHeliBuilder implements IHeliBuilder {
    Helicopter helicopter = null;
    public LuxuryHeliBuilder() {
        helicopter = new Helicopter();
        helicopter.reference = "Luxury helicopter";
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
