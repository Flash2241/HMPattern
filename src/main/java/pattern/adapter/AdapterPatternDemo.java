package pattern.adapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {

        MemoryCard memoryCard = new MemoryCard();
        UsbAdapter usbAdapter = new UsbAdapter(memoryCard);
        Computer computer = new Computer();
        computer.readFromUsb(usbAdapter);
    }
}

