public class ResidentialSite {

    private double units;
    private double rate;

    public ResidentialSite() {
    }

    public double getBillableAmount(){
        return getBase() + getTax();
    }

    public double getBase() {
        return this.units * this.rate;
    }

    public double getTax() {
        return getBase() * Site.TAX_RATE;
    }
}
