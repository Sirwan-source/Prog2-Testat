public class Bruch {

    // ----------  Factory  ----------
    public static Rational[] rationalFactory(int n) throws DivisionByZero {
        if (n == 0) {
            throw new DivisionByZero("Teilen durch 0 geht nicht.");
        }
        Rational[] rat = new Rational[5];
        for (int i = 0; i < rat.length; i++) {
            rat[i] = new Rational(i + 1, n);
        }
        return rat;
    }

    // ----------  main  ----------
    public static void main(String[] args) throws DivisionByZero {
        System.out.println("RationalFactory mit n = 5:");
        Rational[] r5 = rationalFactory(5);
        for (int i = 0; i < r5.length; i++) {
            System.out.println(r5[i]);
        }

        System.out.println("\nRationalFactory mit n = 0:");
        Rational[] r0 = rationalFactory(0);           // wirft Exception
        for (int i = 0; i < r0.length; i++) {
            System.out.println(r0[i]);
        }
    }

    // ----------  innere Klassen  ----------
    static class Rational {
        private int nom;
        private int denom;

        public Rational(int nom, int denom) throws DivisionByZero {
            if (denom == 0) {
                throw new DivisionByZero("Teilen durch 0 geht nicht.");
            }
            this.nom = nom;
            this.denom = denom;
        }

        @Override
        public String toString() {
            return nom + "/" + denom;
        }
    }

    static class DivisionByZero extends Exception {
        public DivisionByZero(String message) {
            super(message);
        }
    }
}
