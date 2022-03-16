package abstractFactory.elfKingdom;

import abstractFactory.kingdom.Castle;

public class ElfCastle implements Castle {
    String description = "This is elf Castle!";
    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return this.description;
    }
}
