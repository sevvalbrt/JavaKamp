package interfaceAbstractDemo;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoapClient client= new KPSPublicSoapClient();
		return client.TCKimlikNoDogrula(customer.getNationalityId(),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),customer.getDateOfBirth());
	}

}
