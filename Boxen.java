import java.util.*;

public class Boxen {
     static class Box implements Comparable<Box>{
        private int weight;
        private String content;

        public Box(String content, int weight){
            this.weight = weight;
            this.content = content;
        }

        public int getWeight(){
            return weight;
        }

        public String getContent(){
            return content;
        }

        @Override
        public int compareTo(Box andereBox){
            return Integer.compare(this.weight, andereBox.weight);
        }

        @Override
        public String toString(){
            return "Box mit Content Type " + content + " wiegt " + weight + "kg";
        }
    }

    public static void main(String[]args){
        List<Box> boxses = new ArrayList<>();
        Random rand = new Random();

        for(int i = 0; i < 5; i++){
            boxses.add(new Box(String.valueOf(i), rand.nextInt(20)+1));
        }

        System.out.println("Unsortiert: \n");
        for(int i = 0; i < boxses.size(); i++){
            System.out.println(boxses.get(i));
        }

        Collections.sort(boxses);
        System.out.println();

        System.out.println("Sortiert: \n");
        for(int i = 0; i < boxses.size(); i++){
            System.out.println(boxses.get(i));
        }

        System.out.println();
        System.out.println("Mad Max ist happy.");
    }
}