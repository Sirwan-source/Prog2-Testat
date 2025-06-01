
public class MorePoint implements Comparable<MorePoint>{
    private int x;
    private int y;

    public MorePoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    @Override
    public int compareTo(MorePoint other){
        return Integer.compare(this.getX(), other.getX());
    }

    // public boolean isMoreEastMoreNorth(MorePoint other){
    //     if(this.x > other.x){
    //         return true;
    //     }
    //     if(this.x == other.x){
    //         return this.y > other.y;
    //     } else {
    //         return false;
    //     }
    // }

    @Override
    public String toString(){
        return String.format("(" + x + "," + y + ")");
    }
}