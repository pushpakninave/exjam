package abstractFactory.elfKingdom;

import abstractFactory.kingdom.Army;

public class ElfArmy implements Army{
    String description = "This is elf Army!";
    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return this.description;
    }
    
}
