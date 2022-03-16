import builderPattern.Phone;
import builderPattern.PhoneBuilder;
import factoryDesign.Android;
import factoryDesign.Ios;
import factoryDesign.OperatingFactory;
import factoryDesign.Os;
import factoryDesign.Windows;

public class App {
    public static void main(String[] args) throws Exception {
        
        // factory design.
        Os phone = new Windows();
        phone.specs();
        OperatingFactory source = new OperatingFactory();
        // creating desired object.
        Os phone1 = source.getOs("openSc");
        Os phone2 = (new OperatingFactory()).getOs("closedSc");
        phone1.specs();
        phone2.specs();

        // builder pattern.
        // Phone phone = new Phone("Android",2,"snapDragon",5.5,3100);
        // System.out.println(phone);
        // PhoneBuilder samsung = new PhoneBuilder();
        // samsung.setBattery(3100);
        // samsung.setOs("Android");
        // samsung.setProcessor("snapdragon");
        // samsung.setRam(5);
        // samsung.setScreenSize(5.5);
        
        // Phone sam = samsung.getPhone();
        // System.out.println(sam);
        // or
        // Phone samsung = (new PhoneBuilder().setBattery(3100).setOs("Android").setProcessor("snapdragon").setRam(2).setScreenSize(5.5)).getPhone();
        // System.out.println(samsung);


        // 
    }
}
