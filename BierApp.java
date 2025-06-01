import java.util.*;

public class BierApp{
    public static void main(String[] args) {
        List<Fass> fass = new ArrayList<>();

        int[][] dinfass = {
            {600, 381},
            {400, 381},
            {310, 363},
        };

        int[][] eurofass = {
            {532, 408},
            {365, 408},
            {327, 395},
            {216, 395},
        };

        Random rand = new Random();
        String[] inhalte = {"Bier", "Wasser", "Limo"};

        for(int i = 0; i < 20; i++){
            int[][] quelle;

            if(rand.nextBoolean()){
                quelle = dinfass;
            } else {
                quelle = eurofass;
            }

            int index = rand.nextInt(quelle.length);
            int hoehe = quelle[index][0];
            int durchmesser = quelle[index][1];

            String inhalt = inhalte[rand.nextInt(inhalte.length)];

            Bierfass fasse = new Bierfass(hoehe, durchmesser, inhalt);
            fass.add(fasse);
        }

        System.out.println();
        System.out.println("Unsortierte Liste: ");
        for(int i = 0; i < fass.size(); i++){
            System.out.println(fass.get(i));
        }

        Collections.sort(fass);

        System.out.println();
        System.out.println("Sortierte Liste: ");
        for(int i = 0; i < fass.size(); i++){
            System.out.println(fass.get(i));
        }

        System.out.println();
        System.out.println("Bier ist happy.");
    }
}