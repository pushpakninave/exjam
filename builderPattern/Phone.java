package builderPattern;

public class Phone {
    private String Os;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;

public Phone(String os,int ram,String processor,double screenSize,int battery)    {
        this.Os = os;
        this.ram = ram;
        this.processor = processor;
        this.screenSize = screenSize;
        this.battery = battery;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String result="["+this.Os+", "+this.ram+", "+this.processor+", "+this.screenSize+", "+this.battery+"]";
        return result;
    }
}
