public class HeliEngineer {
    IHeliBuilder iHeliBuilder;

    public HeliEngineer(IHeliBuilder iHeliBuilder){
        this.iHeliBuilder= iHeliBuilder;
    }

    public void createHelicopter() {
        iHeliBuilder.buildCockpit();
        iHeliBuilder.buildEngine();
        iHeliBuilder.buildRotor();
    }

    public Helicopter getHelicopter() {
        return iHeliBuilder.getHelicopter();
    }
}
