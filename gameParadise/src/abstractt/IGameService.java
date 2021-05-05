package abstractt;

import entity.Game;

public interface IGameService {
	void gameAdd(Game game );
	void gameDelete(Game game);
	void gameUpdate(Game game, String gameName, int gameId, double gamePrice);
	

}
