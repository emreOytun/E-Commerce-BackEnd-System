package backend.business.concretes;

import backend.business.abstracts.LoginService;
import backend.entities.concretes.Customer;

public class LoginManager implements LoginService {

	@Override
	public boolean login(Customer customer) {
		// login operations
		boolean result = true;
		return result;
	}
	
}
