import java.util.*;

public class GenericEimer{
    public static class Eimer implements Comparable<Eimer>{
        private int volume;

        public Eimer(int volume){
            this.volume = volume;
        }

        public int getVolume(){
            return volume;
        }

       @Override
        public int compareTo(Eimer otherEimer){
            return Integer.compare(this.volume, otherEimer.volume);
        }

        @Override
        public String toString(){
            return "Eimer mit Volumen " + volume;
        }
    }

    public static < T extends Comparable<T>> List<T> genericMergeSort(List<T> list){
        if(list.size() <= 1){
            return list;
        }
        int mid = list.size() / 2;
        List<T> left = genericMergeSort(list.subList(0,mid));
        List<T> right = genericMergeSort(list.subList(mid, list.size()));

        return merge(left,right);
    }
    
    private static < T extends Comparable<T>> List<T> merge(List<T> left, List<T> right){
        List<T> res = new ArrayList<>();
        int i = 0;
        int j = 0;

        while(i < left.size() && j < right.size()){
            if(left.get(i).compareTo(right.get(j)) <= 0){
                res.add(left.get(i++));
            } else {
                res.add(right.get(j++));
            }
        }
        
        while(i < left.size()){
            res.add(left.get(i++));
        }

        while(j < right.size()){
            res.add(right.get(j++));
        }
        
        return res;
    }

    public static void main(String[] args) {
        List<Eimer> eimerListe = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++){
            eimerListe.add(new Eimer(rand.nextInt(100)+1));
        }

        System.out.println("Unsortiert: \n");
        for(int i = 0; i < eimerListe.size(); i++){
            System.out.println(eimerListe.get(i));
        }

        // Collections.sort(eimerListe);
        List<Eimer> sortierteListe = genericMergeSort(eimerListe);
        System.out.println();

        System.out.println("Sortiert: \n");
        for(int i = 0; i < sortierteListe.size(); i++){
            System.out.println(sortierteListe.get(i));
        }

        System.out.println();
        System.out.println("Eimer ist happy.");
    }
}