package solid.interfacesegregation.badexample;

public class AContainer {
    private Operations ops;

    public AContainer(Operations ops) {
        this.ops = ops;
    }

    public void doYourContainerStuffToMe(){
        this.ops.operation3();
    }
}
