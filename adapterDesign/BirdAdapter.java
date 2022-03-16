package adapterDesign;

public class BirdAdapter implements Toy{
    Sparrow sparrow;
    public BirdAdapter(Sparrow sparrow){
        this.sparrow = sparrow;
    }
    //we wanted sparrow to sing music.
    public void music(){
        sparrow.speak();
    }
}
