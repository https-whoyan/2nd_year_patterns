package Devices.Factory;

import Devices.AppleLaptop;
import Devices.AppleSmartphone;
import Devices.Laptop;
import Devices.Smartphone;

public class AppleFactory implements DeviceFactory {
    @Override
    public Smartphone createSmartphone() {
        return new AppleSmartphone();
    }
    @Override
    public Laptop createLaptop() {
        return new AppleLaptop();
    }
}