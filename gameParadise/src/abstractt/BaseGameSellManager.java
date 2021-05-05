package abstractt;

import entity.Campaign;
import entity.Game;
import entity.GameSell;
import entity.Gamer;

public abstract class BaseGameSellManager implements IGameSellService {

	@Override
	public void gameSell(Gamer gamer, Game game) {
		System.out.println("Sayın " + gamer.getFirstName()  +  " Aldığınız  Oyun : " + game.getGameName());
		
	}

	@Override
	public void gameSell(Gamer gamer, Campaign campaign, Game game , GameSell gamesell) {
		
		gamesell.getPrice();
		gamesell.getDiscount();
		
		System.out.println(game.getGameName() + " İndirimli Fiyatı : " + gamesell.getDiscountedPrice());
		
	}

}
