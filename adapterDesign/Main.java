package adapterDesign;

public class Main {
   public static void main(String[] args) {
        ToyDuck tduck = new ToyDuck();
        System.out.println("----------\n toyduck :");
        tduck.music();
        
        Sparrow sparrow = new Sparrow();
        System.out.println("----------\n sparrow :");
        sparrow.fly();
        sparrow.speak();

        BirdAdapter bAdapt = new BirdAdapter(sparrow);
        System.out.println("----------\n making sparrow :");
        bAdapt.music();
   } 
}
