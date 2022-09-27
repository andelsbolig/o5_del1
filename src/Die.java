public class Die {
    private double value;

    public double getValue() { return this.value; }
    public void setValue(double newValue) { this.value = newValue;}

    public Die () {
    }

    public void roll()
    {
        this.value = getNewValue();
    }

    private double getNewValue()
    {
        return Math.random() * 6;
    }
}
