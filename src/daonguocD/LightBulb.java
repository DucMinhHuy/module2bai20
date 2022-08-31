package daonguocD;

import org.openjsse.util.RSAKeyUtil;

public class LightBulb implements Switchable{

    @Override
    public void turnOn() {
        System.out.println("LightBuld: buld turned on...");
    }

    @Override
    public void turnOff() {
        System.out.println("LightBuld: buld turned off...");
    }
}
