package gameDemo;

public class GameManager implements CRUDService<Game>{

	@Override
	public void add(Game input) {
		System.out.println("Added game:" + input.getName());
		
	}

	@Override
	public void delete(Game input) {
		System.out.println("Deleted game:" + input.getName());
		
	}

	@Override
	public void update(Game input) {
		System.out.println("Updated game:" + input.getName());
		
	}

}
