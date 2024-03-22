public interface IAircraft {
    String getReference();
    void setAircraftState(AircraftState aircraftState);
    EngineState getEngineState();
    void setEngineState(EngineState engineState);
    AircraftState getAircraftState();
    AircraftState getFlyingState();
    AircraftState getLandingState();
    AircraftState getLandedState();
    AircraftState getExplodedState();
    int getAltitude();
    void setAltitude(int altitude);
    void registerObserver(AltitudeObserver observer);
    void unregisterObserver(AltitudeObserver observer);
    void notifyObservers();
    void startEngine();
    void stopEngine();
    void takeOff();
    void landingMode();
    void land();
    void increaseAltitude(int increaseAmt);
    void increaseAltitude();
    void decreaseAltitude(int decreaseAmt);
    void decreaseAltitude();
    void explode();
    void repair();
}
