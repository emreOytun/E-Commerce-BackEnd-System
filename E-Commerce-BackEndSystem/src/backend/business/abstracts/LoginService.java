package backend.business.abstracts;

import backend.entities.concretes.Customer;

public interface LoginService {
	public boolean login(Customer customer);
}
