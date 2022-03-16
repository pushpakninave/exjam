package compositeDesign;

/*
lets say we have a computer that is made of two compunents 

computer(composite)->
1. cabinet(composite)->
    .Hard_drive(leaf)
    .Motherboard(composite)->
        .Ram(leaf)
        .CPU(leaf)

2. peripherals(composite)->
    .mouse(leaf)
    .keyboard(leaf) 

The program prints the price of individual components.
client want to design the program such that if client try to access the price of peripherals 
the program must tell all the prices of objects needed in buy peripherals and individual 
if needed. 
*/

public class CompositeTest {
    public static void main(String[] args) {
        Component hd = new Leaf(4000, "HDD");
        Component mouse = new Leaf(300, "mouse");
        Component keyboard = new Leaf(500, "keybord");
        Component ram = new Leaf(2000, "Ram");
        Component cpu = new Leaf(3000, "CPU");

        Composite ph = new Composite("peripherals");
        Composite cabinet = new Composite("Cabinet"); 
        Composite motherBoard = new Composite("MotherBoard");
        Composite computer = new Composite("Computer");
    
        //desired hierarchy.
        ph.addComponent(keyboard);
        ph.addComponent(mouse);

        motherBoard.addComponent(ram);
        motherBoard.addComponent(cpu);
        
        cabinet.addComponent(hd);
        cabinet.addComponent(motherBoard);        
        
        computer.addComponent(ph);
        computer.addComponent(cabinet);
    
        computer.showPrice();
    }   
}
