

public class Motorrad implements Comparable<Motorrad>{
    private double leistung;
    private int weight;
    private String name;

    public Motorrad(double leistung, int weight, String name){
        this.leistung = leistung;
        this.weight = weight;
        this.name = name;
    }

    public double getLeistung(){
        return leistung;
    }

    public void setLeistung(double leistung){
        this.leistung = leistung;
    }

     public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

     public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getLeistungsweight(){
        return leistung / weight;
    }

    public int compareTo(Motorrad other){
        return Integer.compare(this.weight, other.weight);
    }

    @Override
    public String toString(){
        return name + " | "  + leistung + " PS | " + weight + " kg | " ;
            //    String.format("Leistungsgewicht: %.3f PS/kg", getLeistungsweight());
    }
}