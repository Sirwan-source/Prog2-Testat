import java.util.*;

public class App{
    public static class Haus implements Comparable<Haus>{
        private double haushoehe;

        public Haus(double haushoehe){
            this.haushoehe = haushoehe;
        }

        public double getHaushoehe(){
            return haushoehe;
        }

        @Override
        public int compareTo(Haus anderesHaus){
            return Double.compare(this.haushoehe, anderesHaus.haushoehe);
        }

        @Override
        public String toString(){
            return "Hoehe: " + haushoehe;
        }
    }

    public static void main(String[] args) {
        List<Haus> haeuser = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            haeuser.add(new Haus(rand.nextInt(10)+ 1));
        }
        
        System.out.print("unsortiert: ");
        System.out.println(haeuser);

        Collections.sort(haeuser);

        System.out.print("sortiert: ");
        System.out.println(haeuser);

        System.out.println("Mad Max ist happy.");
    }
}