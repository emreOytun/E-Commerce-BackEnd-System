package backend.business.abstracts;

import backend.entities.concretes.Customer;

public interface SignUpService {
	public boolean signUp(Customer customer);
}
