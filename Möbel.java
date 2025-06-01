import java.util.*;

public class Möbel{
    static class Moebel implements Comparable<Moebel>{
        private int weight;
        private String name;

        public Moebel(String name, int weight){
            this.name = name;
            this.weight = weight;
        }

        public String getName(){
            return name;
        }

        public int getWeight(){
            return weight;
        }

        @Override
        public int compareTo(Moebel other){
            return Integer.compare(this.weight, other.weight);
        }
        
        @Override
        public String toString(){
            return " Tische mit Name " + name + "(" +  weight + "kg)";
        }
    }

         public static void main(String[] args){
            List<Moebel> moebels = new ArrayList<>();
            Random rand = new Random();


            for(int i = 0; i < 5; i++){
                moebels.add(new Moebel(String.valueOf(i), rand.nextInt(10)+1));
            }

            System.out.println("Unsortiert: \n");
            for(int i = 0; i < moebels.size(); i++){
                System.out.println(moebels.get(i));
            }

            System.out.println();
            Collections.sort(moebels);

            System.out.println("Sortiert: \n");
            for(int i = 0; i < moebels.size(); i++){
                System.out.println(moebels.get(i));
            }

            System.out.println();
            System.out.println("Moebel ist happy.");
        }
    }
