package abstractFactory.elfKingdom;

import abstractFactory.kingdom.Army;
import abstractFactory.kingdom.Castle;
import abstractFactory.kingdom.King;
import abstractFactory.kingdom.KingdomFactory;

public class ElfKingdomFactory implements KingdomFactory {

    @Override
    public Castle createcastle() {
        return new ElfCastle();
    }

    @Override
    public King createKing() {
        return new ElfKing();
    }

    @Override
    public Army createArmy() {
        return new ElfArmy();
    }
    
}
