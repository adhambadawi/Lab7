public class LifelineSite {

    private double units;
    private double rate;

    public LifelineSite() {
    }
    public double getBillableAmount(){
        double base = units * rate * 0.5;
        double tax = base * Site.TAX_RATE * 0.2;
        return base + tax;
    }
}
