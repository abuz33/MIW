package model;

public class Project extends LesEenheid {
    private double productCijfer;
    private double processCijfer;
    private double methodenEnTechniekCijfer;


    public Project(double productCijfer, double processCijfer, double methodenEnTechniekCijfer, String naam, int ects, int studieJaar) {
        super(naam, ects, studieJaar);
        this.productCijfer = productCijfer;
        this.processCijfer = processCijfer;
        this.methodenEnTechniekCijfer = methodenEnTechniekCijfer;
    }

    public void setProductCijfer(int productCijfer) {
        this.productCijfer = productCijfer;
    }

    public void setProcessCijfer(int processCijfer) {
        this.processCijfer = processCijfer;
    }

    public void setMethodenEnTechniekCijfer(int methodenEnTechniekCijfer) {
        this.methodenEnTechniekCijfer = methodenEnTechniekCijfer;
    }

    public void isAfgerond() {
    }

    @Override
    public String toString() {
        return super.toString() + String.format("(%.1f, %.1f, %.1f) ", productCijfer, processCijfer, methodenEnTechniekCijfer);
    }

}
