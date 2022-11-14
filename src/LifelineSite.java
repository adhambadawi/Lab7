public class LifelineSite{

    private double units;
    private double rate;

    public LifelineSite() {
    }
    public double getBillableAmount(){
        return getBase() + getTax();
    }

    public double getBase() {
        return this.units * this.rate * 0.5;
    }

    public double getTax() {
        return getBase() * Site.TAX_RATE * 0.2;
    }
}
