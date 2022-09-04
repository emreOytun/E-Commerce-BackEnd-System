package backend.business.concretes;

import backend.business.abstracts.SignUpService;
import backend.entities.concretes.Customer;

public class SignUpManager implements SignUpService {

	private boolean checkCustomer(Customer customer) {
		
		if (customer.getPassword().length() < 6) {
			return false;
		}
		
		if (customer.getFirstName().length() < 2 || customer.getLastName().length() < 2) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public boolean signUp(Customer customer) {
		if (checkCustomer(customer)) {
			return true;
		}
		return false;
	}
	
}
