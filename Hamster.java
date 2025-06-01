
public class Hamster extends Haustier{
    private int kmh;

    public Hamster(String name, int kmh){
        super(name);
        this.kmh = kmh;
    }

    @Override
    public String toString(){
        return "Hamster " + name + " " + kmh;
    }
}