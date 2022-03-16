package decoratorDesign;

public class UnArmedTroll implements Troll{
    @Override
    public void attack() {
        System.out.println("Troll attacks!");
    }
    @Override
    public int getAttackPower() {
        return 10;
    }
    @Override
    public void runAway() {
        System.out.println("Troll attack and runs away");
    }
}
