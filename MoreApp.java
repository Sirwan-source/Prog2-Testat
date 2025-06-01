import java.util.*;

public class MoreApp{
    public static void main(String[] args){
        List<MorePoint> points = new ArrayList<>();
        Random rand = new Random();

        for(int i = 0; i < 25; i++){
            int x = rand.nextInt(201) - 100;
            int y = rand.nextInt(201) - 100;
            points.add(new MorePoint(x,y));
        }

        System.out.println();
        System.out.println("Unsortierte Liste: ");
        for(int i = 0; i < points.size(); i++){
            System.out.println(points.get(i));
        }

        Collections.sort(points);


        System.out.println();
        System.out.println("Sortierte Liste: ");
        for(int i = 0; i < points.size(); i++){
            System.out.println(points.get(i));
        }

        System.out.println();
        System.out.println("More ist happy.");

    }
}