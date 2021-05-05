package abstractt;

import java.util.Date;

import entity.Gamer;

public interface IGamerService {
	void add(Gamer gamer);
	void delete(Gamer gamer);
	void update(Gamer gamer,  String firsName, String lastName, Date birthday, String natioanlId, String email);
	

}
