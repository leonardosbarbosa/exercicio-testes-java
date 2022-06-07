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

}
