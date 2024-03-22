import static java.lang.Math.abs;

public class LandingState implements AircraftState {
    private IAircraft aircraft;
    public LandingState(IAircraft aircraft) {
        this.aircraft = aircraft;
    }
    @Override
    public void startEngine() {
        System.out.println("Cannot start engine, " + aircraft.getReference() + " is flying (landing gear extended)");
    }

    @Override
    public void stopEngine() {
        this.aircraft.setEngineState(EngineState.stopped);
        System.out.println(aircraft.getReference() + " engine stopped");
    }

    @Override
    public void takeOff() {
        System.out.println(aircraft.getReference() + " is already flying!");
    }

    @Override
    public void landingMode() {
        System.out.println(aircraft.getReference() + " is already in landing mode");
    }

    @Override
    public void land() {
        this.aircraft.setAircraftState(this.aircraft.getLandedState());
        System.out.println(aircraft.getReference() + " is now landed");
        stopEngine();
    }

    @Override
    public void increaseAltitude() {
        this.aircraft.setAltitude(this.aircraft.getAltitude() + 1000);
        System.out.println(aircraft.getReference() + " increased altitude by: " + 1000 + ". Current altitude: " + this.aircraft.getAltitude());
    }

    @Override
    public void increaseAltitude(int increaseAmt) {
        if (increaseAmt < 0) {decreaseAltitude(abs(increaseAmt)); return;}
        this.aircraft.setAltitude(this.aircraft.getAltitude() + increaseAmt);
        System.out.println(aircraft.getReference() + " increased altitude by: " + increaseAmt + ". Current altitude: " + this.aircraft.getAltitude());
    }

    @Override
    public void decreaseAltitude() {
        int newAltitude = this.aircraft.getAltitude() - 1000;
        if (newAltitude < 0) {this.aircraft.setAltitude(0);}
        else { this.aircraft.setAltitude(newAltitude);}
        System.out.println(aircraft.getReference() + " decreased altitude by: " + 1000 + ". Current altitude: " + this.aircraft.getAltitude());
    }

    @Override
    public void decreaseAltitude(int decreaseAmt) {
        if (decreaseAmt < 0) {increaseAltitude(abs(decreaseAmt)); return;}
        int newAltitude = this.aircraft.getAltitude() - decreaseAmt;
        if (newAltitude < 0) {this.aircraft.setAltitude(0);}
        else { this.aircraft.setAltitude(newAltitude);}
        System.out.println(aircraft.getReference() + " decreased altitude by: " + decreaseAmt + ". Current altitude: " + this.aircraft.getAltitude());
    }

    @Override
    public void explode() {
        this.aircraft.setAircraftState(this.aircraft.getExplodedState());
    }

    @Override
    public void repair() {
        System.out.println(aircraft.getReference() + " is already repaired");
    }
}
