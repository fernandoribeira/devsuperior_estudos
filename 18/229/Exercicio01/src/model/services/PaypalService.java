package model.services;

import model.interfaces.OnlinePaymentService;

public class PaypalService implements OnlinePaymentService {
	
	private static Double MONTHLY_INTEREST = 0.01;
	private static final Double FEE_PERCENTAGE = 0.02; 

	@Override
	public Double interest(Double amount, Integer months) {
		return (amount * MONTHLY_INTEREST) * months ;
	}
	
	@Override
	public Double paymentFee(Double amount) {
		return amount * FEE_PERCENTAGE;
	}

}
