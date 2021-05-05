package entity;

import java.util.Date;

import concrete.*;


public class Main {

	public static void main(String[] args) {
		
		GamerManager gamerManager = new GamerManager();
		GameManager gameManager = new GameManager();
		GameSellManager gameSellManager = new GameSellManager();
		CampaignManager campaignManager = new CampaignManager();
		
		Gamer gamer1 = new Gamer(1, "Fatih Serdar", "Aydemir", new Date ( 1999,01,01),"11111111111","blabla@gmail.com");
		gamerManager.add(gamer1);
		gamerManager.delete(gamer1);
		gamerManager.update(gamer1, "Faruk", "Aydın", new Date(1999,02,02), "22222222222", "asdasd@gmail.com");
		
		System.out.println("**************************************************");
		
		Game game1 = new Game(1, "CsGo", 9.99);
		gameManager.gameAdd(game1);
		gameManager.gameDelete(game1);
		gameManager.gameUpdate(game1,"Pubg", 2, 50.0);
		
		System.out.println("**************************************************");
		
		GameSell gameSell1 = new GameSell(50, 10, 0);
		gameSellManager.gameSell(gamer1, game1);
		gameSellManager.gameSell(gamer1, null, game1, gameSell1);
		
		System.out.println("**************************************************");
		
		Campaign campaign1 = new Campaign(1, " Çılgın Hafta Başladı !");
		campaignManager.campaignAdd(campaign1);
		campaignManager.campaignDelete(campaign1);
		campaignManager.campaignUpdate(campaign1, 2, " Patron Çıldırdı !");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
