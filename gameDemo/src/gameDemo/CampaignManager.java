package gameDemo;

public class CampaignManager implements CRUDService<Campaign> {

	@Override
	public void add(Campaign input) {
		System.out.println("Added campaign :"+ input.getName());
		
	}

	@Override
	public void delete(Campaign input) {
		System.out.println("Deleted campaign :"+ input.getName());
		
	}

	@Override
	public void update(Campaign input) {
		System.out.println("Updated campaign :"+ input.getName());
		
	}

	

}
