package decoratorDesign;

public class ArmedTroll implements Troll{
    
    public Troll decorated;
    
    public ArmedTroll(Troll decorated){
        this.decorated = decorated;
    }

    @Override
    public void attack() {
        System.out.println("Troll attacks with sword");
    }
    @Override
    public int getAttackPower() {
        return decorated.getAttackPower()+10;
    }
    @Override
    public void runAway() {
        System.out.println("Troll screams and run away.");
    }
}
