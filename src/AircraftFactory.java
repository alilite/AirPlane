abstract class AircraftFactory {
    public static CommercialFactory commercialFactory = new CommercialFactory();
    public static MilitaryFactory militaryFactory = new MilitaryFactory();
    public static LuxuryFactory luxuryFactory = new LuxuryFactory();

    public static AircraftFactory factory(Type type) {
        AircraftFactory aircraftFactory = null;
        switch (type) {
            case commercial:
                aircraftFactory = commercialFactory;
                break;
            case military:
                aircraftFactory = militaryFactory;
                break;
            case luxury:
                aircraftFactory = luxuryFactory;
                break;
            default:
                throw new IllegalArgumentException("Invalid type");
        }
        return aircraftFactory;
    }
    public abstract Airplane createAirplane();
    public abstract Helicopter createHelicopter();
}
