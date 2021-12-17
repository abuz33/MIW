package solid.interfacesegregation.solution;

public class MUser {
    private interfaceOperations1 ops;

    public MUser(interfaceOperations1 ops) {
        this.ops = ops;
    }

    public void doYourOperations(){
        // ...
        this.ops.operation1();
    }
}
