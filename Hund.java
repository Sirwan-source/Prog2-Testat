
public class Hund extends Haustier{
    private int hoehe;

    public Hund(String name, int hoehe){
        super(name);
        this.hoehe = hoehe;
    }
    
    public String toString(){
        return "Hund" + name + " " + hoehe;
    }
}