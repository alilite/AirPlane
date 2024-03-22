public class PlaneEngineer {
    IPlaneBuilder iPlaneBuilder;

    public PlaneEngineer(IPlaneBuilder iPlaneBuilder){ //generalisation
        this.iPlaneBuilder= iPlaneBuilder;
    }

    public void createAirplane() {
        iPlaneBuilder.buildCockpit();
        iPlaneBuilder.buildEngine();
        iPlaneBuilder.buildWings();
    }

    public Airplane getPlane() {
        return iPlaneBuilder.getPlane();
    }
}
