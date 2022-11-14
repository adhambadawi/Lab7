public class ResidentialSite {

    private double units;
    private double rate;

    public ResidentialSite() {
    }

    public double getBillableAmount(){
        double base = getBase(units, rate);
        double tax = getTax(base);
        return base + tax;
    }

    private double getTax(double base) {
        double tax = getBase(base, Site.TAX_RATE);
        return tax;
    }

    private double getBase(double units, double rate) {
        double base = units * rate;
        return base;
    }
}
