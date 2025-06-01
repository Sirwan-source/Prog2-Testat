import java.util.*;

public class PruefungsApp{
    public static void main(String[] args) {
        List<Motorrad> bike = new ArrayList<>();

        bike.add(new Motorrad(34, 150, "Yamaha XT 500" ));
        bike.add(new Motorrad(101, 201, "Suzuki GSXR 750"));

        String[] typen = {"Honda CB 500", "BMW R 1250", "Kawasaki Ninja", "Ducati Monster", "Harley Sportster"};
        Random rand = new Random();

        for(int i = 0; i < typen.length; i++){
            int weight = 100 + rand.nextInt(201);
            double leistung = 10 + rand.nextInt(291);
            bike.add(new Motorrad(leistung, weight, typen[i]));
        }

        System.out.println();
        System.out.println("Unsortierte Liste: \n");
        for(int i = 0; i < bike.size(); i++){
            System.out.println(bike.get(i));
        }

        System.out.println();
        Collections.sort(bike);

        System.out.println();
        System.out.println("Sortierte Liste: \n");
        for(int i = 0; i < bike.size(); i++){
            System.out.println(bike.get(i));
        }

        System.out.println();
        System.out.println("Motorrad ist happy.");
    }
}