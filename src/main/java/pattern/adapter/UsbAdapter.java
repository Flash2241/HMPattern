package pattern.adapter;

public class UsbAdapter implements USB {
    private MemoryCard memoryCard;

    public UsbAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void connectWithUsbCable() {
        System.out.println("Адаптер преобразует сигнал USB в сигнал карты памяти.");
        memoryCard.readData();
    }
}