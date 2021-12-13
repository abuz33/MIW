package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BatteryFactoryTest {
    private final BatteryFactory bf = new BatteryFactory();

    /**
     * @verifies return car battery if the capacity above 10Ah
     * @see BatteryFactory#createBattery(double, double)
     */
    @Test
    public void createBattery_shouldReturnCarBatteryIfTheCapacityAbove10Ah() throws Exception {
        CarBattery expected = new CarBattery(15, 7, BatteryTechnology.LEAD);
        IBattery returned = bf.createBattery(15, 7);
        assertEquals(expected, returned, "Should get this message if they are not same");

        expected = new CarBattery(11, 17, BatteryTechnology.LEAD);
        returned = bf.createBattery(11, 17);
        assertEquals(expected, returned, "Should get this message if they are not same");
    }

    /**
     * @verifies return mobile battery if the capacity below or equal to 10Ah and voltage is above 5V
     * @see BatteryFactory#createBattery(double, double)
     */
    @Test
    public void createBattery_shouldReturnPowerToolBatteryIfTheCapacityBelowOrEqualTo10AhAndVoltageIsAbove5V() throws Exception {
        PowerToolBattery expected = new PowerToolBattery(10, 10);
        IBattery returned = bf.createBattery(10, 10);
        assertEquals(expected, returned, "Should get this message if they are not same");

        expected = new PowerToolBattery(1, 13);
        returned = bf.createBattery(1, 13);
        assertEquals(expected, returned, "Should get this message if they are not same");
    }

    /**
     * @verifies return power tool battery if the capacity below or equal to 10Ah and voltage is below or equal to 5V
     * @see BatteryFactory#createBattery(double, double)
     */
    @Test
    public void createBattery_shouldReturnMobilePhoneBatteryIfTheCapacityBelowOrEqualTo10AhAndVoltageIsBelowOrEqualTo5V() throws Exception {
        MobilePhoneBattery expected = new MobilePhoneBattery(10, 2);
        IBattery returned = bf.createBattery(10, 2);
        assertEquals(expected, returned, "Should get this message if they are not same");

        expected = new MobilePhoneBattery(1, 1);
        returned = bf.createBattery(1, 1);
        assertEquals(expected, returned, "Should get this message if they are not same");
    }

    /**
     * @verifies return null if any of the value is below zero or null
     * @see BatteryFactory#createBattery(double, double)
     */
    @Test
    public void createBattery_shouldReturnNullIfAnyOfTheValueIsBelowZeroOrNull() throws Exception {
        IBattery returned = bf.createBattery(-1, 1);
        assertNull(returned, "Should get this message if they are not same");
        returned = bf.createBattery(1, -1);
        assertNull(returned, "Should get this message if they are not same");
    }
}
