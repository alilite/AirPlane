public class ExplodedState implements AircraftState {
    private IAircraft aircraft;
    public ExplodedState(IAircraft aircraft) {
        this.aircraft = aircraft;
    }

    @Override
    public void startEngine() {
        System.out.println("Cannot perform action. "+ aircraft.getReference() + " exploded");
    }

    @Override
    public void stopEngine() {
        System.out.println("Cannot perform action. "+ aircraft.getReference() + " exploded");
    }

    @Override
    public void takeOff() {
        System.out.println("Cannot perform action. "+ aircraft.getReference() + " exploded");
    }

    @Override
    public void landingMode() {
        System.out.println("Cannot perform action. "+ aircraft.getReference() + " exploded");
    }

    @Override
    public void land() {
        System.out.println("Cannot perform action. "+ aircraft.getReference() + " exploded");
    }

    @Override
    public void increaseAltitude() {
        System.out.println("Cannot perform action. "+ aircraft.getReference() + " exploded");
    }

    @Override
    public void increaseAltitude(int increaseAmt) {
        System.out.println("Cannot perform action. "+ aircraft.getReference() + " exploded");
    }

    @Override
    public void decreaseAltitude() {
        System.out.println("Cannot perform action. "+ aircraft.getReference() + " exploded");
    }

    @Override
    public void decreaseAltitude(int decreaseAmt) {
        System.out.println("Cannot perform action. "+ aircraft.getReference() + " exploded");
    }

    @Override
    public void explode() {
        System.out.println("Cannot perform action. "+ aircraft.getReference() + " exploded");
    }

    public void repair() {
        aircraft.setAircraftState(this.aircraft.getLandedState());
        aircraft.setEngineState(EngineState.stopped);
        System.out.println(aircraft.getReference() + " has been repaired");
    }
}
