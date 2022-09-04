package backend.business.abstracts;

import backend.entities.concretes.Customer;

public interface CustomerService {
	public boolean signUp(Customer customer);
	public boolean login(Customer customer);
	public void activate(Customer customer);
	public void addCustomer(Customer customer);
	public void deleteCustomer(Customer customer);
	public void updateCustomer(Customer customer);
}
