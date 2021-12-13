package nl.hva.miw.ooad.battery;

public class Main {
    public static void main(String[] args) {
        Battery carBattery = BatterFactory.createBattery("car");
        System.out.println(carBattery);

        Battery nasBattery = BatterFactory.createBattery("nas");
        System.out.println(nasBattery);
        Battery phoneBattery = BatterFactory.createBattery("PhONE");
        System.out.println(phoneBattery);
        Battery powerTOOL = BatterFactory.createBattery("PowerTOOL");
        System.out.println(powerTOOL);
        Battery camera = BatterFactory.createBattery("camera");
        System.out.println(camera);
    }
}
