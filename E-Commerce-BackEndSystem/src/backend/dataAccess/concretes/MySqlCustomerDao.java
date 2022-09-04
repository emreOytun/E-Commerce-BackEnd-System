package backend.dataAccess.concretes;

import java.util.List;

import backend.dataAccess.abstracts.CustomerDao;
import backend.entities.concretes.Customer;

public class MySqlCustomerDao implements CustomerDao {

	@Override
	public void add(Customer customer) {
		//db operation
		System.out.println("Customer is added to MySql Database : " + customer.getFirstName());
	}

	@Override
	public void delete(Customer customer) {
		//db operation
		System.out.println("Customer is deleted from MySql Database : " + customer.getFirstName());
	}

	@Override
	public void update(Customer customer) {
		//db operation
		System.out.println("Customer is updated in MySql Database : " + customer.getFirstName());
	}

	@Override
	public Customer get(int id) {
		//db operation
		System.out.println("Customer is fetched from MySql Database : " + id);
		return null;
	}

	@Override
	public List<Customer> getAll() {
		//db operation
		System.out.println("All customers are fetched from MySql Database ");
		return null;
	}
	
}
