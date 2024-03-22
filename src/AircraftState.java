public interface AircraftState {
    void startEngine();
    void stopEngine();
    void takeOff();
    void landingMode();
    void land();
    void increaseAltitude();
    void increaseAltitude(int increaseAmt);
    void decreaseAltitude();
    void decreaseAltitude(int decreaseAmt);
    void explode();
    void repair();
}
