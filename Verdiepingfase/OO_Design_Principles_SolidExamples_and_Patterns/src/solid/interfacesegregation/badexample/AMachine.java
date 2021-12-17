package solid.interfacesegregation.badexample;

public class AMachine {
    private Operations ops;

    public AMachine(Operations ops) {
        this.ops = ops;
    }

    public void doSomeWork(){
        // ...
        this.ops.operation2();
    }

}
