public interface IPlaneBuilder {
    void buildEngine();
    void buildWings();
    void buildCockpit();
    Airplane getPlane();
}
