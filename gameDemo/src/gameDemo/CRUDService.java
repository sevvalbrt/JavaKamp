package gameDemo;

public interface CRUDService<T> {

	void add(T input);
	
	void delete(T input);
	
	void update(T input);
		
	
}
