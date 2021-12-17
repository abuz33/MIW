package solid.interfacesegregation.badexample;

public class MUser {
    private Operations ops;

    public MUser(Operations ops) {
        this.ops = ops;
    }

    public void doYourOperations(){
        // ...
        this.ops.operation1();
    }
}
