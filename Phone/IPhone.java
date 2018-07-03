public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return "Bam-du-bah-bah!";
    }
    @Override
    public String unlock() {
        return "-click-";
    }
    @Override
    public void displayInfo() {
        System.out.println(
            "Battery: " + getBattery() + "%\n" +
            "Version: " + getVersion() + "\n" +
            "Carrier: " + getCarrier() + "\n"
        );           
    }
}