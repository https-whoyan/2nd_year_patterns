package Devices.Factory;

import Devices.Laptop;
import Devices.Smartphone;

public interface DeviceFactory {
    Smartphone createSmartphone();
    Laptop createLaptop();
}