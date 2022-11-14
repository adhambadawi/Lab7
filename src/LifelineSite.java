public class LifelineSite {

    private static double units = 5;
    private static double rate = 15;

    public LifelineSite() {
    }
    public double getBillableAmount(){
        return getBase() + getTax();
    }

    private static double getTax() {
        double tax = getBase() * Site.TAX_RATE * 0.2;
        return tax;
    }

    private static double getBase() {
        double base = units * rate * 0.5;
        return base;
    }

}
