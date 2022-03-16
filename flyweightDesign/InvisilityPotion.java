package flyweightDesign;

public class InvisilityPotion implements Potion {
    
    @Override
    public void drink(){
        System.out.println("you become invisible.");
    }
}
