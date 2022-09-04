package backend.business.concretes;

import backend.business.abstracts.CustomerService;
import backend.business.abstracts.LoginService;
import backend.business.abstracts.SignUpService;
import backend.core.abstracts.EmailValidationService;
import backend.dataAccess.abstracts.CustomerDao;
import backend.entities.concretes.Customer;

public class CustomerManager implements CustomerService {
	
	private CustomerDao customerDao;
	private LoginService loginService;
	private SignUpService signUpService;
	private EmailValidationService emailValidator;
	
	public CustomerManager(CustomerDao customerDao, LoginService loginService, SignUpService signUpService, 
			EmailValidationService emailValidator) {
		super();
		this.customerDao = customerDao;
		this.loginService = loginService;
		this.signUpService = signUpService;
		this.emailValidator = emailValidator;
	}

	@Override
	public boolean signUp(Customer customer) {
		boolean result = signUpService.signUp(customer);		
		if (result) {
			this.addCustomer(customer);
			System.out.println("Customer is signed up successfully : " + customer.getFirstName());
			emailValidator.sendValidationEmail(customer);
		} else {
			System.out.println("Signed up is not successful");
		}
		return result;
	}

	@Override
	public boolean login(Customer customer) {
		boolean result =  loginService.login(customer);
		if (result) {
			System.out.println("Customer is logged in successfully : " + customer.getFirstName());
		} else {
			System.out.println("Login is not successful");
		}
		return result;
	}

	@Override
	public void activate(Customer customer) {
		customer.setActivated(true);
		customerDao.update(customer);
		System.out.println("Customer is activated : " + customer.getFirstName());
	}
	
	@Override
	public void addCustomer(Customer customer) {
		customerDao.add(customer);
	}

	@Override
	public void deleteCustomer(Customer customer) {
		customerDao.delete(customer);
	}

	@Override
	public void updateCustomer(Customer customer) {
		customerDao.update(customer);
	}
	
}
