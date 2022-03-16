package abstractFactory.elfKingdom;

import abstractFactory.kingdom.King;

public class ElfKing implements King{
    String description = "This is elf King!";
    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return description;
    }
}
