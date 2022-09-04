package backend;

import backend.business.abstracts.LoginService;
import backend.business.abstracts.SignUpService;
import backend.business.concretes.CustomerManager;
import backend.business.concretes.LoginManager;
import backend.business.concretes.SignUpManager;
import backend.core.abstracts.EmailValidationService;
import backend.core.concretes.EmailValidationManager;
import backend.dataAccess.abstracts.CustomerDao;
import backend.dataAccess.concretes.MySqlCustomerDao;
import backend.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		CustomerDao customerDao = new MySqlCustomerDao();
		LoginService loginService = new LoginManager();
		SignUpService signUpService = new SignUpManager();
		EmailValidationService emailValidator = new EmailValidationManager();
		
		CustomerManager customerManager = new CustomerManager(customerDao, loginService, signUpService, emailValidator);
		
		Customer emre = new Customer(1, "Emre", "Oytun", "emreoytun58@gmail.com", "1234..qq");
		customerManager.signUp(emre);
		customerManager.activate(emre);
		
	}

}
