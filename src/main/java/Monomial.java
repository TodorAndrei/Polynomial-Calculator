public class Monomial {
    private int degree;
    private double coefficient;
    private boolean added;

    public Monomial(int degree, double coefficient) {
        this.degree = degree;
        this.coefficient = coefficient;
        this.added = false;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public boolean isAdded() {
        return added;
    }

    public void setAdded(boolean added) {
        this.added = added;
    }
}

