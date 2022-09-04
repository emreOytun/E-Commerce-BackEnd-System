package backend.business.concretes;

import backend.business.abstracts.SignUpService;
import backend.entities.concretes.Customer;

public class GoogleSignUpManager implements SignUpService {
	
	@Override
	public boolean signUp(Customer customer) {
		GoogleSignUpManager googleSignUpManager = new GoogleSignUpManager();
		return googleSignUpManager.signUp(customer);
	}
	
}
