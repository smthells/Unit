import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import taxes.TaxDebitMinusCredit;
import taxes.TaxSystem;

class CompanyTest {

    @Test
    public void shiftMoneyDebitCorrect() {
        // given:
        final TaxSystem taxDebitMinusCredit = new TaxDebitMinusCredit();
        Company company = new Company("Nike", taxDebitMinusCredit);
        final int debit = 500;
        final int credit = 0;
        final int amount = 500;
        // when:
        company.shiftMoney(amount);
        // then:
        Assertions.assertEquals(debit, company.debit);
        Assertions.assertEquals(credit, company.credit);
    }

    @Test
    public void shiftMoneyZeroDebitCorrect() {
        // given:
        final TaxSystem taxDebitMinusCredit = new TaxDebitMinusCredit();
        Company company = new Company("Nike", taxDebitMinusCredit);
        final int debit = 0;
        final int credit = 0;
        final int amount = 0;
        // when:
        company.shiftMoney(amount);
        // then:
        Assertions.assertEquals(debit, company.debit);
        Assertions.assertEquals(credit, company.credit);
    }

    @Test
    public void shiftMoneyCreditCorrect() {
        // given:
        final TaxSystem taxDebitMinusCredit = new TaxDebitMinusCredit();
        Company company = new Company("Nike", taxDebitMinusCredit);
        final int credit = 500;
        final int debit = 0;
        final int amount = -500;
        // when:
        company.shiftMoney(amount);
        // then:
        Assertions.assertEquals(credit, company.credit);
        Assertions.assertEquals(debit, company.debit);
    }
}