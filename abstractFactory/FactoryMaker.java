package abstractFactory;

import abstractFactory.elfKingdom.ElfKingdomFactory;
import abstractFactory.kingdom.Army;
import abstractFactory.kingdom.Castle;
import abstractFactory.kingdom.King;

public class FactoryMaker {
    public static void main(String[] args) {
        ElfKingdomFactory factory = new ElfKingdomFactory(); 
        Castle castle = factory.createcastle();
        King king = factory.createKing();
        Army army = factory.createArmy();
        
        System.out.println(castle.getDescription()+"\n"+king.getDescription()+"\n"+army.getDescription());
        
    }
}
