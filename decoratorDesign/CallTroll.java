package decoratorDesign;

public class CallTroll {
    public static void main(String[] args) {
        Troll pepe = new UnArmedTroll();
        pepe.attack();
        System.out.println(pepe.getAttackPower());
        pepe.runAway();

        Troll papa = new ArmedTroll(pepe);
        papa.attack();
        System.out.println(papa.getAttackPower());
        pepe.runAway();
    }
}
