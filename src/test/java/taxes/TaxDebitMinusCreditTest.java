package taxes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaxDebitMinusCreditTest {

    @Test
    public void testCalcTaxForDebitMinusCreditCorrect() {
        // given:
        final int debit = 1000;
        final int credit = 100;
        final int expectedTaxes = 135;
        final TaxSystem taxDebitMinusCredit = new TaxDebitMinusCredit();
        // when:
        int taxes = taxDebitMinusCredit.calcTaxFor(debit, credit);
        // then:
        Assertions.assertEquals(expectedTaxes, taxes);
    }

    @Test
    public void testCalcTaxForDebitMinusCreditEqualsZero() {
        // given:
        final int debit = 1000;
        final int credit = 1200;
        final int expectedTaxes = 0;
        final TaxSystem taxDebitMinusCredit = new TaxDebitMinusCredit();
        // when:
        int taxes = taxDebitMinusCredit.calcTaxFor(debit, credit);
        // then:
        Assertions.assertEquals(expectedTaxes, taxes);
    }
}