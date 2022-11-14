public class ResidentialSite {

    private double units;
    private double rate;

    public ResidentialSite() {
    }

    public double getBillableAmount(){
        double base = units * rate;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }
}
