package daonguocD;

public class ElectricPowerSwitchTest {
    public static void main(String[] args) {
        Switchable switchable=new LightBulb();
        Switch s =new ElectricPowerSwitch(switchable);
        s.press();
        s.press();
        Switchable switchable1=new Fan();
        Switch fan=new ElectricPowerSwitch(switchable1);
        fan.press();
        fan.press();
    }
}
