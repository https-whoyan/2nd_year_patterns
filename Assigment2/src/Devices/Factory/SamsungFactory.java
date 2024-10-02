package Devices.Factory;

import Devices.Laptop;
import Devices.SamsungLaptop;
import Devices.SamsungSmartphone;
import Devices.Smartphone;

public class SamsungFactory implements DeviceFactory {
    @Override
    public Smartphone createSmartphone() {
        return new SamsungSmartphone();
    }
    @Override
    public Laptop createLaptop() {
        return new SamsungLaptop();
    }
}