package backend.core.abstracts;

import backend.entities.concretes.Customer;

public interface EmailValidationService {
	public void sendValidationEmail(Customer customer);
}
