import java.util.*;

public class PointApp{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        List<MPoint> points = new ArrayList<>();

        System.out.println("Gebe einen Pubkt in (Format: x y ) oder E zum beenden: ");

        while(true){
            System.out.println("Punkt: ");

            String input = scan.nextLine().trim();
            if(input.equalsIgnoreCase("E")){
                break;
            }

            String[] parts = input.split("\\s+");
            if(parts.length != 2){
                System.out.println("Falsche Eingabe");
                continue;
            }

            try {
                int x = Integer.parseInt(parts[0]);
                int y = Integer.parseInt(parts[1]);
                points.add(new MPoint(x, y));
            } catch (NumberFormatException e) {
                System.out.println("Falsches Ergebnis: ");
            }
        }

        System.out.println();
        System.out.println("Unsortierte Liste: \n");

        for(int i = 0; i < points.size(); i++){
            System.out.println(points.get(i));
        }

        Collections.sort(points);
        System.out.println();
        System.out.println("Sortierte Liste: \n");

        for(int i = 0; i < points.size(); i++){
            System.out.println(points.get(i));
        }

        System.out.println();
        System.out.println("Point ist happy.");
    }
}