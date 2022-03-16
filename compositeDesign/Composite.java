package compositeDesign;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    String name;
    List<Component> componentList = new ArrayList<>();
    
    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void showPrice() {
        System.out.println(name+" :");
        for(Component c : componentList){
            c.showPrice();
        }
    }
    
    public void addComponent(Component comp){
        componentList.add(comp);
    }

}

