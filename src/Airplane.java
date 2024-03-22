import java.util.ArrayList;
import java.util.List;
class Airplane implements  IAircraft{
    static private int idPool = 0;
    int ID;
    public String reference;

    private Engine engine;
    private Wings wings;
    private Cockpit cockpit;

    EngineState engineState = EngineState.stopped;
    AircraftState aircraftState;
    AircraftState flyingState;
    AircraftState landingState;
    AircraftState landedState;
    AircraftState explodedState;
    private int altitude = 0;
    private List<AltitudeObserver> observers = new ArrayList<>();



    public String getReference() {
        return reference;
    }

    public void setAircraftState(AircraftState aircraftState) {
        this.aircraftState = aircraftState;
    }


    public EngineState getEngineState() {
        return engineState;
    }


    public void setEngineState(EngineState engineState) {
        this.engineState = engineState;
    }

    public AircraftState getAircraftState() {
        return this.aircraftState;
    }

    public AircraftState getFlyingState() {
        return this.flyingState;
    }
    public AircraftState getLandingState() {
        return this.landingState;
    }
    public AircraftState getLandedState() {
        return this.landedState;
    }
    public AircraftState getExplodedState() {
        return this.explodedState;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public void setWings(Wings wings) {
        this.wings = wings;
    }
    public void setCockpit(Cockpit cockpit) {
        this.cockpit = cockpit;
    }

    public int getAltitude() {
        return this.altitude;
    }
    public void setAltitude(int altitude) {
        this.altitude = altitude;
        notifyObservers();
    }

    public void registerObserver(AltitudeObserver observer) {
        observers.add(observer);
    }
    public void unregisterObserver(AltitudeObserver observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        for (AltitudeObserver observer : observers) {
            observer.updateAltitude(altitude);
        }
    }

    Airplane() {
        this.ID = ++idPool;
        this.landedState = new LandedState(this);
        this.landingState = new LandingState(this);
        this.flyingState = new FlyingState(this);
        this.explodedState = new ExplodedState(this);
        this.aircraftState = this.landedState;
    }

    public void startEngine() {
        aircraftState.startEngine();
    }

    public void stopEngine() {
        aircraftState.stopEngine();
    }

    public void takeOff() {
        aircraftState.takeOff();
    }

    public void landingMode() {
        aircraftState.landingMode();
    }
    public void land() {
       aircraftState.land();
    }
    public void increaseAltitude(int increaseAmt) {
       aircraftState.increaseAltitude(increaseAmt);
    }

    public void increaseAltitude() {
        aircraftState.increaseAltitude();
    }

    public void decreaseAltitude(int decreaseAmt) {
       aircraftState.decreaseAltitude(decreaseAmt);
    }

    public void decreaseAltitude() {
       aircraftState.decreaseAltitude();
    }

    public void explode() {
       aircraftState.explode();
    }

    public void repair() {
        aircraftState.repair();
    }

    @Override
    public String toString() {
        return getReference() + " is aircraft ID : " + ID + ". Current altitude: " + getAltitude();
    }
}
