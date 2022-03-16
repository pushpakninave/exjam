package adapterDesign;

public class Sparrow implements Bird {
    @Override
    public void speak(){
        System.out.println("chirp! chirp!");
    }

    @Override
    public void fly(){
        System.out.println("flying.");
    }
}
