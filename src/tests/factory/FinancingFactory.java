package tests.factory;

import entities.Financing;

public class FinancingFactory {

	public static Financing getValidFinancing() {
		return new Financing(100000.0, 2000.0, 80);
	}
	
	public static Financing getInvalidFinancing() {
		return new Financing(100000.0, 2000.0, 20);
	}
}
