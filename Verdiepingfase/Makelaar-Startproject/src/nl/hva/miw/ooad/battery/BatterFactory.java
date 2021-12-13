package nl.hva.miw.ooad.battery;

import java.util.Locale;

public class BatterFactory {
    public static Battery createBattery(String type) {
        Battery battery;
        switch (type.toLowerCase(Locale.ROOT)) {
            case "phone":
                battery = new PhoneBattery();
                break;
            case "car":
                battery = new CarBattery();
                break;
            case "camera":
                battery = new CameraBattery();
                break;
            case "powertool":
                battery = new PowerTool();
                break;
            case "nas":
                battery = new NasBattery();
                break;
            default:
                return null;
        }

        return battery;
    }
}
