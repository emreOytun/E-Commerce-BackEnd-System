package backend.dataAccess.abstracts;

import java.util.List;

import backend.entities.concretes.Customer;

public interface CustomerDao {
	void add(Customer customer);
	void delete(Customer customer);
	void update(Customer customer);
	Customer get(int id);
	List<Customer> getAll();
}
