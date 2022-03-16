package abstractFactory.kingdom;

public interface KingdomFactory {
    public Castle createcastle();
    public King createKing();
    public Army createArmy();
}
