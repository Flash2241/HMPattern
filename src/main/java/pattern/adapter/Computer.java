package pattern.adapter;

public class Computer {
    public void readFromUsb(USB usbDevice) {
        usbDevice.connectWithUsbCable();
    }
}
