package solid.interfacesegregation.solution;

public class AMachine {
    private interfaceOperations2 ops;

    public AMachine(interfaceOperations2 ops) {
        this.ops = ops;
    }

    public void doSomeWork(){
        // ...
        this.ops.operation2();
    }

}
