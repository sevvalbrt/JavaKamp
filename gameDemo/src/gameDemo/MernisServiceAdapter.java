package gameDemo;

public class MernisServiceAdapter implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		
		KPSPublicSoapClient client= new KPSPublicSoapClient();
		return client.TCKimlikNoDogrula(gamer.getNationalityId(),gamer.getFirstName().toUpperCase(),gamer.getLastName().toUpperCase(),gamer.getDateOfBirth());
	}

}
