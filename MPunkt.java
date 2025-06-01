
public class MPunkt implements Punkt{
    private int x;
    private int y;

    public MPunkt(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX(){
        return x;
    }

    @Override
    public int getY(){
        return y;
    }

    @Override
    public void setX(int x){
        this.x = x;
    }

    @Override
    public void setY(int Y){
        this.y = y;
    }

    @Override
    public double getDistance(){
        return Math.sqrt(x * x + y * y);
    }

    public double getDistanceTo(Punkt other){
        int dx = this.x - other.getX();
        int dy = this.y - other.getY();

        return Math.sqrt(dx * dx + dy * dy);
    }

    public int compareTo(Punkt other){
        return Double.compare(this.getDistance(), other.getDistance());
    }

    @Override
    public String toString(){
        return "MPoint(" + x + ", " + y + ") Distanz: " + getDistance();
    }    
}