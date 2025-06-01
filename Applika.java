import java.util.*;

public class Applika{
    public static void main(String[] args){
        List<Haustier> haustiere = new ArrayList<>();

        haustiere.add(new Hamster(" Rainer", 4));
        haustiere.add(new Hamster(" Schumi", 120));
        haustiere.add(new Hund(" Rex", 63));
        haustiere.add(new Hund(" Waldi", 21));
        

        System.out.println("Unsortiert: \n");
        for(int i = 0; i < haustiere.size(); i++){
            System.out.println(haustiere.get(i));
        }

        List<Hund> hunde = new ArrayList<>();
        List<Hamster> hamster = new ArrayList<>();

        for(int i = 0; i < haustiere.size();i++){
            Haustier h = haustiere.get(i);
            if(h instanceof Hund){
                hunde.add((Hund) h);
            } else if (h instanceof Hamster){
                hamster.add((Hamster) h);
            }
        }

        Collections.sort(hunde);
        Collections.sort(hamster);

        System.out.println();
        System.out.println("Sortiert: ");

        System.out.println();
        System.out.println("Hamsterliste: ");
        for(int i = 0; i < hamster.size(); i++){
            System.out.println(hamster.get(i));
        }

        System.out.println();
        System.out.println("Hundeliste: ");
        for(int i = 0; i < hunde.size(); i++){
            System.out.println(hunde.get(i));
        }

        System.out.println();
        System.out.println("Mad Max ist happy.");
    }
}