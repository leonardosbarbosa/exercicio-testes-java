package tests;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import entities.Financing;
import tests.factory.FinancingFactory;

public class FinancingTests {

	@Test
	public void financingConstructorShouldCreateObjectWhenArgumentsAreValid() {
		Financing entity = FinancingFactory.getValidFinancing();
		Assertions.assertNotNull(entity);
	}

	@Test
	public void financingConstructorShouldThrowIllegalArgumentExceptionWhenArgumentsAreInvalid() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing entity = FinancingFactory.getInvalidFinancing();
		});
	}

	@Test
	public void setTotalAmountShouldUpdateWhenValidArguments() {
		Financing entity = FinancingFactory.getValidFinancing();
		double expectedAmount = 50000.00;
		entity.setTotalAmount(expectedAmount);
		Assertions.assertEquals(expectedAmount, entity.getTotalAmount());
	}

	@Test
	public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenArgumentsAreInvalid() {
		Financing entity = FinancingFactory.getValidFinancing();
		double invalidAmount = 200000.00;
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			entity.setTotalAmount(invalidAmount);
		});
	}
	
	@Test
	public void setIncomeShouldUpdateWhenValidArguments() {
		Financing entity = FinancingFactory.getValidFinancing();
		double expectedIncome = 3000.00;
		entity.setIncome(expectedIncome);
		Assertions.assertEquals(expectedIncome, entity.getIncome());
	}

	@Test
	public void setIncomeShouldThrowIllegalArgumentExceptionWhenArgumentsAreInvalid() {
		Financing entity = FinancingFactory.getValidFinancing();
		double invalidIncome = 800.00;
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			entity.setIncome(invalidIncome);
		});
	}
	
	@Test
	public void setMonthsShouldUpdateWhenValidArguments() {
		Financing entity = FinancingFactory.getValidFinancing();
		int expectedMonths = 85;
		entity.setMonths(expectedMonths);
		Assertions.assertEquals(expectedMonths, entity.getMonths());
	}

	@Test
	public void setMonthsShouldThrowIllegalArgumentExceptionWhenArgumentsAreInvalid() {
		Financing entity = FinancingFactory.getValidFinancing();
		int invalidMonths = 18;
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			entity.setMonths(invalidMonths);
		});
	}
	
	@Test
	public void entryShouldCalcCorrectlyTheEntryValue () {
		Financing entity = FinancingFactory.getValidFinancing();
		double expectedEntry = 20000.0;
		Assertions.assertEquals(expectedEntry, entity.entry());
	}
	
	@Test
	public void quotaShouldCalcCorrectlyTheQuotaValue () {
		Financing entity = FinancingFactory.getValidFinancing();
		double expectedQuota = 1000.0;
		Assertions.assertEquals(expectedQuota, entity.quota());
	}

}
