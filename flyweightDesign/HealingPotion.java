package flyweightDesign;

public class HealingPotion implements Potion{

    @Override
    public void drink() {
      System.out.println("you feel healed.");      
    }
  
}
