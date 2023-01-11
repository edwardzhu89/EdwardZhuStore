public class Phone extends ElectronicItem{

    private String networkType;
    private int screenSize;

    public Phone(String name, String location, int price, String description, int storageCapacity, String model, String maker, String operatingSystem, String networkType, int screenSize) {
        super(name, location, price, description, storageCapacity, model, maker, operatingSystem);
        this.networkType = networkType;
        this.screenSize = screenSize;
    }

    public Phone(int storageCapacity, String model, String maker, String operatingSystem, String networkType, int screenSize) {
        super(storageCapacity, model, maker, operatingSystem);
        this.networkType = networkType;
        this.screenSize = screenSize;
    }

    public Phone(){
        this.networkType="";
        this.screenSize=0;
    }

    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "networkType='" + networkType + '\'' +
                ", screenSize=" + screenSize +
                "}{"+getStorageCapacity()+", "+getModel()+", "+getMaker()+", "+getOperatingSystem()+"}{"+getName()+", "+getLocation()+", "+getLocation()+", "+getPrice()+", "+getDescription()+"}";
    }
}
