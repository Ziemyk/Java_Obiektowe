package pl.usbDevice;

public interface USBDevice {
    boolean connect();
    boolean disconnect();
    String getName();
}
