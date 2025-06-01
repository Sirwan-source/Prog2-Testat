
public class MPoint implements Point{
    private int x;
    private int y;

    public MPoint(int x, int y){
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
    public void setY(int y){
        this.y = y;
    }

    @Override
    public double getDistance(){
        return Math.abs(x) + Math.abs(y);
    }

    @Override
    public int compareTo(Point other){
        return Double.compare(this.getDistance(), other.getDistance());
    }

    @Override
    public String toString(){
        return "MPoint(" + x + ", " + y + ") Distanz: " + getDistance();
    }
}