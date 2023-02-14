package util;

public class CurrencyConverter {
	
	public static double IOF = 0.06;

	public static double dollarConverter(double dollarPrice, double dollarsBought) {
		return (dollarPrice * dollarsBought) + ((dollarPrice * dollarsBought) * IOF);
	}
	
}
