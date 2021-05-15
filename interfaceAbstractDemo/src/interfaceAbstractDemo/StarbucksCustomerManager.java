package interfaceAbstractDemo;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	public void save(Customer customer) {
		
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.Save(customer);
		}
		else {
			System.out.println("Not a valid person");
		}
	}
	
	
}
