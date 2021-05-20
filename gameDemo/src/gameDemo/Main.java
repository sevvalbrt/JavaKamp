package gameDemo;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer=new Gamer(1, "Sevval", "Barut", "1996", "11111111111");
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.add(gamer);
		
		Game game=new Game(1, "PubG", 500);
		GameManager gameManager=new GameManager();
		gameManager.add(game);
		
		Campaign campaign=new Campaign(1, "Big Sale", 100);
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign);
		
		GameSaleManager gameSaleManager=new GameSaleManager();
		gameSaleManager.sale(gamer, game);
		gameSaleManager.campaignSale(gamer, game, campaign);
		

	}

}
