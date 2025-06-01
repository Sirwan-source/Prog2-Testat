import java.util.*;

public class Rational{
    private int num;
    private int denom;

    public Rational(int num, int denom){
        if(denom == 0){
            throw new IllegalArgumentException("Teilen durch 0 geht nicht.");
        }

        if(denom < 0){
            num = -num;
            denom = -denom;
        }

        int ggt = gcd(Math.abs(num), denom);
        this.num = num / ggt;
        this.denom = denom / ggt;
    }
    
     private int gcd(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }

    @Override
    public boolean equals (Object other){
        if(this == other) return true;
        if(!(other instanceof Rational)) return false;
        Rational o = (Rational) other;
        return (num == o.num) && (denom == o.denom);
    }

    @Override
    public int hashCode(){
        return Objects.hash(num,denom);
    }

    @Override
    public String toString(){
        return num + "/" + denom;
    }
}