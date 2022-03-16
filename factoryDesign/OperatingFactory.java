package factoryDesign;

public class OperatingFactory {
    public Os getOs(String osType){
        
        if(osType.equals("openSc")) return new Android();
        
        else if(osType.equals("closedSc")) return new Ios();
        
        else return new Windows();
        
    }
}
