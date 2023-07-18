import taxes.TaxDebit;
import taxes.TaxDebitMinusCredit;
import taxes.TaxSystem;

public class Main {
    public static void main(String[] args) {
        TaxSystem taxDebit = new TaxDebit();
        TaxSystem taxDebitMinusCredit = new TaxDebitMinusCredit();
        Company company = new Company("Nike", taxDebit);
        company.shiftMoney(100);
        company.shiftMoney(-90);
        company.payTaxes();

        company.setTaxSystem(taxDebitMinusCredit);
        company.shiftMoney(100);
        company.shiftMoney(-90);
        company.payTaxes();
    }
}
