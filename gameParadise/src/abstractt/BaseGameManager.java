package abstractt;

import entity.Game;

public abstract class BaseGameManager implements IGameService{

	@Override
	public void gameAdd(Game game) {
		System.out.println(":) Yeni Oyun Piyasada  : " + game.getGameName() + " Senin İçin Fiyatı : " + game.getGamePrice());
		
	}

	@Override
	public void gameDelete(Game game) {
		System.out.println(":( Sakin Ol Ama Bu Oyun Artık Yok  : " + game.getGameName());
		
	}

	@Override
	public void gameUpdate(Game game, String gameName, int gameId, double gamePrice) {
		
		game.setGameId(gameId);
		game.setGameName(gameName);
		game.setGamePrice(gamePrice);
		
		System.out.println(":) Bu Oyun Eskisinden Daha İyi  : " + game.getGameName() + " / " + game.getGameId() + " / " + game.getGamePrice() );
		
	}

}
