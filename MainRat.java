
public class MainRat{
    public static void main(String[] args){
        Rational r1 = new Rational(1,2);
        Rational r2 = new Rational(2,4);
        Rational r3 = new Rational(3,4);

        System.out.println("r1 == r2: " + r1.equals(r2));
        System.out.println("r1 == r3: " + r1.equals(r3));

        RatRange range1 = new RatRange(r1,r3);
        RatRange range2 = new RatRange(r2, new Rational(3,4));

        System.out.println("range1 == range2: " + range1.equals(range2));

        // Set<RatRange> set = new HashSet<>();
        // set.add(range1);
        // System.out.println("set.contains(range2): " + set.contains(range2));
    }
}