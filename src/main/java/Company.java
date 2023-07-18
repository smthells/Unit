import taxes.TaxSystem;

public class Company {
    protected String title;
    protected int debit = 0;
    protected int credit = 0;
    protected TaxSystem taxSystem;

    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount) {
        if (amount >= 0) {
            debit += amount;
        } else {
            credit += Math.abs(amount);
        }
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void payTaxes() {
        int taxAmount = taxSystem.calcTaxFor(debit, credit);
        System.out.println("Компания " + title + " уплатила налог в размере: " + taxAmount + " руб.");
        debit = 0;
        credit = 0;
    }
}