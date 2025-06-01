
public class Haustier implements Comparable<Haustier>{
    protected String name;

    public Haustier(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public int compareTo(Haustier other){
        return this.name.compareTo(other.name);
    }
    
    @Override
    public String toString(){
        return name + "Hoehe: " + "kmh";
    }
}