package solid.interfacesegregation.solution;

public class AContainer {
    private interfaceOperations3 ops;

    public AContainer(interfaceOperations3 ops) {
        this.ops = ops;
    }

    public void doYourContainerStuffToMe(){
        this.ops.operation3();
    }
}
