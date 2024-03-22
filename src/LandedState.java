public class LandedState implements AircraftState {
    private IAircraft aircraft;
    public LandedState(IAircraft aircraft) {
        this.aircraft = aircraft;
    }

    @Override
    public void startEngine() {
        this.aircraft.setEngineState(EngineState.started);
        System.out.println("Engine started");
    }

    @Override
    public void stopEngine() {
        this.aircraft.setEngineState(EngineState.stopped);    // IF STATEMENT FOR SWITCH
        System.out.println("Engine stopped");
    }

    @Override
    public void takeOff() {
        if (this.aircraft.getEngineState() != EngineState.started) { startEngine();}
        System.out.println(aircraft.getReference() + " has taken off");
        this.aircraft.setAltitude(100);
        this.aircraft.setAircraftState(this.aircraft.getFlyingState());
    }

    @Override
    public void landingMode() {
        System.out.println(aircraft.getReference() + " is already landed");
    }

    @Override
    public void land() {
        System.out.println(aircraft.getReference() + " is already landed");
    }

    @Override
    public void increaseAltitude() {
        System.out.println("Cannot increase altitude, " + aircraft.getReference() + " has not taken off");
    }

    @Override
    public void increaseAltitude(int increaseAmt) {
        System.out.println("Cannot increase altitude, " + aircraft.getReference() + " has not taken off");
    }

    @Override
    public void decreaseAltitude() {
        System.out.println("Cannot decrease altitude, " + aircraft.getReference() + " has not taken off");
    }

    @Override
    public void decreaseAltitude(int decreaseAmt) {
        System.out.println("Cannot decrease altitude, " + aircraft.getReference() + " has not taken off");
    }

    @Override
    public void explode() {

    }

    @Override
    public void repair() {
        System.out.println(aircraft.getReference() + " is already repaired");
    }
}
