public class PhoneTest{
    public static void main(String[] args) {
        Galaxy note8 = new Galaxy("346543", 87, "TMobile", "vibrate");
        IPhone x = new IPhone("iOS 12", 99, "Verizon", "default");

        note8.displayInfo();
        // x.displyInfo();
        System.out.println(x.getRingTone());
        System.out.println(x.unlock());
    }
}