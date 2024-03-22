public class AltitudeMonitor implements AltitudeObserver {
    private IAircraft aircraft;

    public AltitudeMonitor(IAircraft aircraft) {
        this.aircraft = aircraft;
    }

    @Override
    public void updateAltitude(int altitude) {
        System.out.println(aircraft);
        if (altitude >= 12000) {
            aircraft.explode();
        }
        else if (altitude >= 10000) {
            System.out.println("Approaching dangerous altitude!");
        }
        else if (altitude <= 0) {
            aircraft.land();
        }
    }
}
