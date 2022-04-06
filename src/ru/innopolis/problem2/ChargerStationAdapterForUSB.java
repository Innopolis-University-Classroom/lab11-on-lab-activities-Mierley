package ru.innopolis.problem2;

public class ChargerStationAdapterForUSB extends ChargerStation{

    public void chargeByLightning(USBPort usbPort) {
        usbPort.chargeByUSB();
    }
}
