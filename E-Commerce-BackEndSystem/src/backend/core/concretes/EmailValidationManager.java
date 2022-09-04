package backend.core.concretes;
import backend.core.abstracts.EmailValidationService;
import backend.entities.concretes.Customer;

public class EmailValidationManager implements EmailValidationService {

	@Override
	public void sendValidationEmail(Customer customer) {
		// email sending operation
		System.out.println("Validation email is sent to the customer : " + customer.getFirstName());
	}

}
