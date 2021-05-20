package gameDemo;

public class GamerManager implements CRUDService<Gamer>{
	
	private GamerCheckService gamerCheckService;

	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer input) {
		
		if(gamerCheckService.checkIfRealPerson(input)) {
		System.out.println("Added gamer :" + input.getFirstName()+ "" + input.getLastName());
		}else {
			System.out.println("Not a valid person");
		}
		
	}

	@Override
	public void delete(Gamer input) {
		System.out.println("Deleted gamer :" + input.getFirstName()+ "" + input.getLastName());
		
	}

	@Override
	public void update(Gamer input) {
		System.out.println("Updated gamer :" + input.getFirstName()+ "" + input.getLastName());
		
	}

	
}
