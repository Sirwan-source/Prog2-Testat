
import java.util.Objects;

public class RatRange{
    private Rational upper;
    private Rational lower;

    public RatRange(Rational upper, Rational lower){
        if(lower == null || upper == null){
            throw new IllegalArgumentException("Outer Bounds.");
        }

        this.lower = lower;
        this.upper = upper;
    }

    @Override
    public boolean equals(Object other){
        if(this == other )return true;
        if(!(other instanceof RatRange)) return false;

        RatRange o = (RatRange) other;
        return lower.equals(o.lower) && upper.equals(o.upper);
    }

    @Override
    public int hashCode(){
        return Objects.hash(lower,upper);
    }

    @Override
    public String toString(){
        return "[" + lower + "..." + upper + "]";
    }
}