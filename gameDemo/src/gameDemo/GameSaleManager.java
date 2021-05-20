package gameDemo;

public class GameSaleManager implements GameSaleService {

	@Override
	public void sale(Gamer gamer, Game game) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + "bought" + game.name+ "game");
		
	}

	@Override
	public void campaignSale(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(gamer.getFirstName() + " " +gamer.getLastName() + "bought" + game.name + "game with" + campaign.name);
		
	}

}
